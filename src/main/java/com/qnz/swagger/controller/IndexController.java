package com.qnz.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "首页",description = "测试api接口")
@RestController
public class IndexController {

    @ApiOperation("首页")
    @GetMapping("/index")
    public String index(@ApiParam(name="id",value="用户id",required=true) @RequestParam(name = "id") Integer id){
        return id+"";
    }
}
