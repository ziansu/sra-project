@org.springframework.web.bind.annotation.RequestMapping(value = "/registration", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getUserRegistrationPage(org.springframework.ui.Model model) {
    model.addAttribute(com.yuralubinec.spring.controller.UserController.USER, new com.yuralubinec.spring.model.User());
    return "userRegistration";
}