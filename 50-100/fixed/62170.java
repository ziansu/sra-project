@net.stigmod.controller.RequestMapping(value = "/help", method = RequestMethod.GET)
public java.lang.String help(org.springframework.ui.ModelMap model) {
    final net.stigmod.domain.system.User user = userRepository.getUserFromSession();
    model.addAttribute("user", user);
    model.addAttribute("host", host);
    model.addAttribute("port", port);
    model.addAttribute("title", "Help");
    return "help";
}