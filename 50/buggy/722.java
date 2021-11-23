@com.bsk.controllers.PutMapping(value = "/update")
public java.lang.String update(com.bsk.domain.User user, org.springframework.ui.Model model) {
    userService.save(user);
    return showHome(model);
}