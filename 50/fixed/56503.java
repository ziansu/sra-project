@org.springframework.web.bind.annotation.GetMapping(value = "/user/verify/{id}")
public java.lang.String verifyNewUser(org.springframework.ui.Model model, @org.springframework.web.bind.annotation.PathVariable
java.util.UUID id) {
    if ((userService.verifyNewUser(id)) == false) {
        return "redirect:/error?code=400";
    }
    return "redirect:/";
}