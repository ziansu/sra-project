public void loginServer() {
    loadPreferences_Account();
    networkController_.setLoginInfo(pid_, password_);
    networkController_.connectToServer();
}