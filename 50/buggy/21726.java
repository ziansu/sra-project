@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login() {
    if (org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().isAuthenticated())
        return "redirect:/amministratore";
    
    return "login";
}