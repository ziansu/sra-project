public void disconnect() {
    clientConnection.setOnMessageListener(null);
    clientConnection.setOnConnectionListener(null);
    clientConnection.setOnDisconnectedListener(null);
    clientConnection.disconnect();
}