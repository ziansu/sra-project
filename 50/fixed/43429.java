public int passwdLength(eu.musesproject.server.entity.Users user) {
    int passwordLength = 0;
    java.lang.String userPassword = user.getPassword();
    if (userPassword != null) {
        passwordLength = userPassword.length();
    }
    return passwordLength;
}