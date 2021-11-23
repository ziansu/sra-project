@com.kchu.controller.GetMapping(value = "/search")
public java.lang.String doSearch(org.springframework.ui.Model model) {
    org.springframework.security.core.Authentication auth = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
    java.lang.String username = auth.getName();
    java.lang.String role = auth.getAuthorities().toString();
    java.lang.Integer id = userRepository.findIdByLogin(username);
    model.addAttribute("role", role.toLowerCase());
    model.addAttribute(new com.kchu.controller.Search());
    return "search";
}