public void logout() {
    if ((authentication.AuthenticationProvider.currentUser) != null) {
        authentication.AuthenticationProvider.currentUser = null;
        states.SuccessMessageState successMessageState = new states.SuccessMessageState("You have logged out successfully!", new states.MainMenuState());
        try {
            java.lang.Thread.sleep(2000);
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        states.StateManager.setCurrentState(successMessageState);
    }else {
        states.ErrorMessageState errorMessageState = new states.ErrorMessageState("There is no logged in user!", new states.MainMenuState());
        states.StateManager.setCurrentState(errorMessageState);
    }
}