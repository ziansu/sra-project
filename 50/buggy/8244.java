public void verifyLogin(java.lang.String username, java.lang.String password) {
    if (!(password.isEmpty())) {
        password = nl.hanze.myhealth.utils.sha512.generateHash(password);
        api.login(username, password);
    }
}