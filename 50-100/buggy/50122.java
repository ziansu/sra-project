@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String home(org.springframework.ui.Model model) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String username = auth.getName();
    de.unileipzig.bis.rbs.testApp.model.User user = userRepository.findByUsername(username);
    java.lang.String name = "Guest";
    if (user != null) {
        name = user.getName();
    }
    model.addAttribute("name", name);
    return "home";
}