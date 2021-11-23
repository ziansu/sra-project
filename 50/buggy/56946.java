public static controllers.Result signIn(java.lang.String mail, java.lang.String password) {
    controllers.Application.userMail = password;
    return controllers.Application.game();
}