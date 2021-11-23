@org.springframework.web.bind.annotation.RequestMapping(value = { "/reg/active" }, method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String active(final org.springframework.ui.Model model, @javax.validation.Valid
@org.springframework.web.bind.annotation.ModelAttribute(value = "account")
jp.co.hyron.ope.dto.AccountDto account, org.springframework.validation.BindingResult result) {
    if (!(result.hasErrors())) {
        if (accountService.accountInit(account)) {
            accountService.flushCache();
            return "/account/reg/success";
        }else {
            result.rejectValue("email", "mail.error");
        }
    }
    return "account/reg/confirm";
}