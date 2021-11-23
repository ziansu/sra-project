@org.springframework.web.bind.annotation.RequestMapping(value = "/logout", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String logout() {
    for (com.oracle.hackthon.model.Account user : userRepository.findAll()) {
        user.setOnlineFlag(1);
        userRepository.saveAndFlush(user);
    }
    return "redirect:/";
}