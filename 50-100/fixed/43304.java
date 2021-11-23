public boolean registerAccount(be.spring.app.model.Account account, java.lang.String password, org.springframework.validation.Errors errors) {
    boolean valid = !(errors.hasErrors());
    if (valid) {
        createAccountWithPassword(account, password);
        mailService.sendPreConfiguredMail(messageSource.getMessage("mail.user.registered", new java.lang.Object[]{ baseUrl , account.getId() , account.getFullName() }, java.util.Locale.ENGLISH));
    }
    return valid;
}