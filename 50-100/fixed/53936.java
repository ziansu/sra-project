@org.springframework.web.bind.annotation.RequestMapping(value = "/login")
public java.lang.String login(@org.springframework.web.bind.annotation.RequestParam(value = "error", required = false)
java.lang.String error, @org.springframework.web.bind.annotation.RequestParam(value = "logout", required = false)
java.lang.String logout, java.util.Locale locale, org.springframework.ui.Model model) {
    if (error != null) {
        java.lang.String message = messageSource.getMessage("LogginController.WrongEmailOrPassword", null, locale);
        model.addAttribute("error", message);
    }
    if (logout != null) {
        java.lang.String message = messageSource.getMessage("LogginController.SuccessfullyLogout", null, locale);
        model.addAttribute("msg", message);
    }
    return "login";
}