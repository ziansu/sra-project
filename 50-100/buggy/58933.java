@org.springframework.web.bind.annotation.RequestMapping(value = { "/provider/forgetPw" , "/siteUser/forgetPw" }, method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public java.lang.String forgetPwProcess(@org.springframework.web.bind.annotation.ModelAttribute(value = "retrieve")
com.sj.repository.util.RetrievePasswordForm form, org.springframework.validation.BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
    }
    com.sj.model.model.SiteUser user = userService.findByPhone(form.getPhone());
    java.lang.System.out.println(user.getPassword());
    userService.updatePassword(user.getId(), encoder.encodePassword(form.getPassword(), null));
    com.sj.model.model.SiteUser usert = userService.findByPhone(form.getPhone());
    java.lang.System.out.println(usert.getPassword());
    return "redirect:/login";
}