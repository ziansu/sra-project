public void doRegistration() throws java.io.IOException, javax.servlet.ServletException, org.json.simple.parser.ParseException {
    com.comicszone.managedbeans.util.passwordcreators.IPasswordCreator passwordCreator = new com.comicszone.managedbeans.util.passwordcreators.SimplePasswordCreator();
    java.lang.String password = passwordCreator.createPassword(PASSWORD_LENGTH);
    com.comicszone.entitynetbeans.Users user = createUser();
    userRegistrationDao.socialNetworkRegistration(user, password);
    javax.faces.context.ExternalContext context = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext();
    context.redirect(((("j_security_check?j_username=" + (user.getNickname())) + "&j_password=") + password));
}