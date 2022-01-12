@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String welcome(org.springframework.ui.Model model, javax.servlet.http.HttpSession session) {
    logger.info("begin");
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if ("anonymousUser".equals(auth.getName())) {
        logger.info("end: incorrect credentials");
        return "redirect:/login";
    }else {
        session.setAttribute("registrationMethod", adminSettings.getRegistrationMethod());
        logger.info("end: correct credentials");
        return "homepage";
    }
}