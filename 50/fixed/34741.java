public static java.lang.String hashPassword(java.lang.String password) {
    return org.launchcode.ace.models.User.encoder.encode(password);
}