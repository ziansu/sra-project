@org.springframework.web.bind.annotation.RequestMapping(value = "/UserProfile/{login}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String userProfile(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.lang.String login) {
    configureCloudinary(model);
    model.addAttribute("profile", userService.findByLogin(login));
    return "userProfile";
}