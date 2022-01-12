@org.springframework.web.bind.annotation.RequestMapping(value = "/signin", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String login(org.springframework.ui.ModelMap model, javax.servlet.http.HttpServletRequest request) {
    final net.stigmod.domain.User user = userRepository.getUserFromSession();
    model.addAttribute("userInfo", user);
    model.addAttribute("host", host);
    model.addAttribute("port", port);
    model.addAttribute("title", "Sign In");
    org.springframework.security.web.csrf.CsrfToken csrfToken = ((org.springframework.security.web.csrf.CsrfToken) (request.getAttribute(org.springframework.security.web.csrf.CsrfToken.class.getName())));
    if (csrfToken != null) {
        model.addAttribute("_csrf", csrfToken);
    }
    return "signin";
}