@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logoutPage(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    if (auth != null) {
        java.lang.System.out.println(auth);
        new org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler().logout(request, response, auth);
        java.lang.System.out.println(auth);
    }
    return "redirect:/login?logout=true";
}