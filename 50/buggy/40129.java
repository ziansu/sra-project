public boolean isMatchingPassword(java.lang.String password) {
    java.lang.System.out.println(pwHash);
    return org.launchcode.ace.models.User.encoder.matches(password, pwHash);
}