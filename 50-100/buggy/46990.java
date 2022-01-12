public void disconnect(java.lang.String reason) {
    state = com.kylegiro.chat.ConnectionState.DISCONNECTED;
    setChanged();
    notifyObservers();
    if (reason != null) {
        javafx.application.Platform.runLater(() -> {
            controller.showDisconnectedDialog(reason);
        });
    }
    serverListener.interrupt();
    try {
        input.close();
        output.close();
        socket.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}