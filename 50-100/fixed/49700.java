@com.zhytnik.library.web.RequestMapping(value = "/registration", method = RequestMethod.POST)
public java.lang.String register(@com.zhytnik.library.web.ModelAttribute(value = "user")
@javax.validation.Valid
com.zhytnik.library.domain.User user, org.springframework.validation.BindingResult bindingResult, @com.zhytnik.library.web.RequestParam(value = "librarian", required = false)
boolean librarian, java.util.Locale locale) {
    com.zhytnik.library.security.UserRole role = (librarian) ? LIBRARIAN : USER;
    user.setRole(role.toString());
    if ((bindingResult.hasErrors()) || (trySaveAndCheckErrors(user, bindingResult, locale, () -> service.add(user)))) {
        return "register";
    }
    return "redirect:home";
}