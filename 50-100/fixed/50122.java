@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String home(org.springframework.ui.Model model) {
    java.lang.String username = this.getAuthentication().getName();
    de.unileipzig.bis.rbs.testApp.model.User user = userRepository.findByUsername(username);
    java.lang.String name = "Guest";
    if (user != null) {
        name = user.getName();
    }
    model.addAttribute("name", name);
    return "home";
}