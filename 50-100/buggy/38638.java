@com.bsk.controllers.GetMapping(value = "/")
public java.lang.String dashboard(org.springframework.ui.Model model, @com.bsk.controllers.RequestParam(required = false)
java.lang.String tabName) {
    org.springframework.security.core.Authentication authentication = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    model.addAttribute("username", authentication.getName());
    if (tabName == null)
        return "dashboard";
    else {
        model.addAttribute("tabName", tabName);
        return "dashboard";
    }
}