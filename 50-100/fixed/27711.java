@org.springframework.web.bind.annotation.RequestMapping(value = { "/edit-user-{passportSeriesAndNumber}" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String editUser(@org.springframework.web.bind.annotation.PathVariable
java.lang.String passportSeriesAndNumber, org.springframework.ui.ModelMap model) {
    by.bsuir.banking.entity.User user;
    try {
        user = userService.findByPassport(passportSeriesAndNumber);
    } catch (by.bsuir.banking.service.exception.ServiceException e) {
        return "error";
    }
    model.addAttribute("user", user);
    model.addAttribute("edit", true);
    return "create-user";
}