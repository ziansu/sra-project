@com.wordnik.swagger.annotations.ApiOperation(value = "添加用户", notes = "")
@org.springframework.web.bind.annotation.RequestMapping(value = "/saveUser", method = { org.springframework.web.bind.annotation.RequestMethod.POST })
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
@org.springframework.web.bind.annotation.ResponseBody
public cn.edu.nju.software.entity.User getUserById(@com.wordnik.swagger.annotations.ApiParam(value = "表单提交的添加用户信息")
@org.springframework.web.bind.annotation.RequestBody
cn.edu.nju.software.entity.User user, javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    user.setPassword(cn.edu.nju.software.util.Util.getMd5(user.getPassword()));
    user.setAccessToken(((java.util.UUID.randomUUID()) + ""));
    user.setCreateTime(new java.util.Date());
    user.setUpdateTime(new java.util.Date());
    user = userMessageService.saveUser(user);
    return user;
}