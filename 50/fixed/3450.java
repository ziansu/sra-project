public void execute() {
    while (_AuthenticationService.has_invalid_token()) {
        if (null == (_AuthenticationCredentials))
            _UserInterface.ask_user_for_authentication_credentials(this);
        
        java.lang.String token = _AuthenticationProvider.authenticate(_AuthenticationCredentials);
    } 
}