private void disconnectMessageRequest() {
    if ((name) != null) {
        serverModel.removeClient(name);
        serverView.appendMessage((("Client " + (name)) + " left the chat\n"));
    }
    serverModel.removeChannel(this);
    try {
        stop();
    } catch (java.io.IOException e) {
        e.printStackTrace();
        java.lang.System.err.println(("Failed to stop the channel thread for user: " + (name)));
    }
}