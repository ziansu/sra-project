@org.springframework.web.bind.annotation.RequestMapping(value = "/admin/users/add/action")
public java.lang.String addUserAction(@org.springframework.web.bind.annotation.RequestParam
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam
java.lang.String password, @org.springframework.web.bind.annotation.RequestParam
java.lang.String dni, @org.springframework.web.bind.annotation.RequestParam
java.lang.String firstName, @org.springframework.web.bind.annotation.RequestParam
java.lang.String lastName1, @org.springframework.web.bind.annotation.RequestParam
java.lang.String lastName2, @org.springframework.web.bind.annotation.RequestParam
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam
java.lang.String telephone) {
    appSpring.entity.User user = new appSpring.entity.User(name, password, dni, firstName, lastName1, lastName1, email, telephone, "ROLE_USER");
    userRepository.save(user);
    return "redirect:/admin/users";
}