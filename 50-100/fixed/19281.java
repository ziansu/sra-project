@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password, org.springframework.ui.Model model) {
    if (userService.check(email, password)) {
        net.petrovsky.flights.model.User user = userService.getByEmail(email);
        model.addAttribute("user", user);
        return user.getRole().equals(Role.ROLE_ADMIN) ? "redirect:/admin" : "redirect:/";
    }else {
        model.addAttribute("msgIncorrectCredentials", "Invalid email/password or you have not registered yet!");
        return "login";
    }
}