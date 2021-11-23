@org.springframework.web.bind.annotation.RequestMapping(value = "/registerForm", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String registerForm(@org.springframework.web.bind.annotation.ModelAttribute(value = "user")
at.fh.swenga.model.User user, org.springframework.ui.Model model) {
    if (user == null)
        user = new at.fh.swenga.model.User();
    
    model.addAttribute("user", user);
    return "register";
}