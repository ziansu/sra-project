public boolean validateUser() {
    java.lang.String[] loginDetails = guiController.getLoginDetails();
    microchat.entity.UserPreferences.USERNAME = loginDetails[0];
    microchat.entity.UserPreferences.PASSWORD = loginDetails[1];
    boolean validated = microchat.handlers.RelayserverHandler.validateUser();
    guiController.eventLogin(validated);
    if (validated) {
        firebaseHandler.authenticateToFirebase();
        firebaseHandler.initiateChatrooms();
        firebaseHandler.initiateFriendList();
        updateFilelist();
        guiController.eventListChatrooms();
    }
    return validated;
}