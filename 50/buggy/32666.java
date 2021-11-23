@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getNewUserPage(org.springframework.ui.Model model) {
    model.addAttribute("users", userRepository.findAll());
    model.addAttribute("user", new app.domain.User());
    return "uusiKayttaja";
}