@org.springframework.web.bind.annotation.RequestMapping(value = "/showUser")
public java.lang.String showUser(javax.servlet.http.HttpServletRequest request, org.springframework.ui.Model model) {
    log.info("查询所有用户信息");
    com.portfoliomanager.entity.Person user = userService.getUser("yyptest");
    log.info(("username:" + (user.getUsername())));
    model.addAttribute("user", user);
    return "showUser";
}