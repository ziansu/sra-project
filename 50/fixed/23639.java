public void connect() {
    clientConnection.setOnMessageListener(this);
    clientConnection.setOnConnectionListener(this);
    clientConnection.setOnDisconnectedListener(this);
    clientConnection.connect();
}