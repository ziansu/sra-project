@org.springframework.web.bind.annotation.RequestMapping(value = "/signup", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.dajia.vo.LoginUserVO userSignup(@org.springframework.web.bind.annotation.RequestBody
com.dajia.vo.LoginUserVO loginUser, javax.servlet.http.HttpServletRequest request) {
    loginUser.loginIP = request.getRemoteAddr();
    loginUser.loginDate = new java.util.Date();
    com.dajia.domain.User user = new com.dajia.domain.User();
    com.dajia.util.UserUtils.copyUserProperties(loginUser, user);
    userService.userSignup(user);
    loginUser = com.dajia.util.UserUtils.addLoginSession(loginUser, user, request);
    return loginUser;
}