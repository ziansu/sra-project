public void disconnect() {
    clientConnection.disconnect();
    clientConnection.setOnMessageListener(null);
    clientConnection.setOnConnectionListener(null);
    clientConnection.setOnDisconnectedListener(null);
}