private boolean validate(java.lang.String token) {
    if ((token == null) || ((token.length()) != 16))
        return false;
    
    return tokenService.tokenIsValid(token);
}