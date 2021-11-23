private void disconnectMessageRequest() {
    if ((name) != null) {
        serverModel.removeClient(name);
        serverView.appendMessage((("Client " + (name)) + " left the chat\n"));
    }
    serverModel.removeChannel(this);
    stop();
}