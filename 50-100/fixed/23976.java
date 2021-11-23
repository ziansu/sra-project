public model.LoginResponse checkCredentials(java.lang.String email, java.lang.String password) {
    if ((((email == null) || (password == null)) || (email.equals(""))) || (password.equals(""))) {
        return loginResponse;
    }else
        if (!(emailService.isValidEmailAddress(email)))
            return loginResponse;
        else
            return userLogin.login(email, password);
        
    
}