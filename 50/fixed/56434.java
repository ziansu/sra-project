void login(java.lang.String alias, java.lang.String serverIp, int portNo, java.lang.String password) {
    client = new client.Client(serverIp, portNo, alias, password, this);
    client.start();
    connectButton.setText("Logout");
}