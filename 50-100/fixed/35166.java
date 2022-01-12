@com.teamtreehouse.web.controller.RequestMapping(path = "/login", method = RequestMethod.GET)
public java.lang.String loginForm(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("user", new com.teamtreehouse.domain.User());
    java.lang.Object flash = request.getSession().getAttribute("flash");
    if (flash == null) {
        return "login";
    }else {
        model.addAttribute("flash", flash);
        request.getSession().removeAttribute("flash");
    }
    return "login";
}