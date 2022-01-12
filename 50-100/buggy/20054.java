@org.springframework.web.bind.annotation.RequestMapping(value = "/login.do", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(java.lang.String username, java.lang.String password, java.lang.String usertype, org.springframework.ui.ModelMap model) {
    java.lang.String tokenid = userService.login(username, password, usertype);
    com.ccc.test.pojo.UserInfo user = userService.fetchUserInfo(tokenid);
    model.addAttribute(GlobalValues.SESSION_USER, user);
    if (user == null) {
        model.addAttribute("result", "用户名或密码错误");
        return "main";
    }
    return "userinfo";
}