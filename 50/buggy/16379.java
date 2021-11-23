@com.cheng.weixin.web.mobile.security.IgnoreSecurity
@org.springframework.web.bind.annotation.RequestMapping(value = "v1/login")
public org.springframework.http.ResponseEntity<com.cheng.weixin.web.mobile.model.Response> login(javax.servlet.http.HttpServletRequest request) {
    com.cheng.weixin.web.mobile.param.LoginDto loginDto = ((com.cheng.weixin.web.mobile.param.LoginDto) (getDto(request, com.cheng.weixin.web.mobile.param.LoginDto.class)));
    return success(loginService.login(loginDto));
}