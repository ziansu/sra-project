@org.springframework.web.bind.annotation.RequestMapping(value = "/showUser")
public java.lang.String showUser(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    log.info("查询所有用户信息");
    java.lang.System.out.println("in controller1");
    com.portfoliomanager.entity.Person user = userService.getUser("yyptest");
    java.lang.System.out.println("in controller2");
    log.info(("username:" + (user.getUsername())));
    model.addAttribute("user", user);
    return "showUser";
}