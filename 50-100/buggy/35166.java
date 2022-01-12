@org.springframework.web.bind.annotation.RequestMapping(path = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String loginForm(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    model.addAttribute("user", new com.teamtreehouse.domain.User());
    try {
        java.lang.Object flash = request.getSession().getAttribute("flash");
        model.addAttribute("flash", flash);
        request.getSession().removeAttribute("flash");
    } catch (java.lang.Exception ex) {
    }
    return "login";
}