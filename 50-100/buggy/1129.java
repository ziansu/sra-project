public com.greenfox.poker.model.ResponseType responseToSuccessfulLogin(com.greenfox.poker.model.LoginRequest loginRequest) {
    com.greenfox.poker.model.PokerUser pokerUserFromDatabase = pokerUserRepo.findByUsername(loginRequest.getUsername());
    java.lang.String passwordOfUsernameFromDatabase = pokerUserFromDatabase.getPassword();
    if (loginRequest.getPassword().equals(passwordOfUsernameFromDatabase)) {
        java.lang.String token = tokenService.generateToken(pokerUserFromDatabase);
        return new com.greenfox.poker.model.UserTokenResponse("success", token, pokerUserFromDatabase.getId());
    }
    return loginWithIvalidUsernameOrPassword();
}