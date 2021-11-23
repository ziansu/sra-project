@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public com.dajia.vo.LoginUserVO userLogin(@org.springframework.web.bind.annotation.RequestBody
com.dajia.vo.LoginUserVO loginUser, javax.servlet.http.HttpServletRequest request) {
    com.dajia.domain.User user = userService.userLogin(loginUser.mobile, loginUser.password, request, false);
    loginUser = com.dajia.util.UserUtils.addLoginSession(loginUser, user, request);
    return loginUser;
}