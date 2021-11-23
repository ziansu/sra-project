public static boolean isValid(java.lang.String pseudo, java.lang.String password, java.lang.String email) {
    return (((pseudo.length()) > 20) || ((email.length()) > 50)) || (!(password.matches(POJO.User.PASSWORD_PATTERN)));
}