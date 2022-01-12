public java.lang.String validate() {
    controllers.UserManagement.log.debug(("Token in the form: " + (token)));
    if ((controllers.UserManagement.passwordValidate(password, retypePassword)) != null) {
        return controllers.UserManagement.passwordValidate(password, retypePassword);
    }
    return null;
}