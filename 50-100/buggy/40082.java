private void validateLoginCredentials(java.lang.String username, java.lang.String password, java.lang.String apiKey) throws com.mediamath.terminalone.exceptions.ClientException {
    if ((apiKey == null) || (apiKey.isEmpty())) {
        com.mediamath.terminalone.TerminalOne.logger.error("Environment does not exist");
        throw new com.mediamath.terminalone.exceptions.ClientException("Please Provide Valid API Key");
    }
    if ((username.isEmpty()) || (password.isEmpty())) {
        com.mediamath.terminalone.TerminalOne.logger.error("Please provide valid credentials.");
        throw new com.mediamath.terminalone.exceptions.ClientException("Please Provide Valid Username and Password.");
    }
}