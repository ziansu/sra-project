public void loginServer() {
    networkController_.setLoginInfo(pid_, password_);
    networkController_.connectToServer();
}