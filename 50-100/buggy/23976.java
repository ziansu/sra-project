public model.LoginResponse checkCredentials(java.lang.String email, java.lang.String password) {
    boolean validEmail = false;
    validEmail = emailService.isValidEmailAddress(email);
    if (((((email == null) || (password == null)) || (email.equals(""))) || (password.equals(""))) || (!validEmail)) {
        return loginResponse;
    }else {
        return userLogin.login(email, password);
    }
}