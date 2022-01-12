@java.lang.Override
public void clientReceivedMessage(java.lang.String message) {
    switch (message) {
        case ttaomae.connectn.network.ConnectNProtocol.START :
            this.updateMessage("Starting game... Waiting for opponent...");
            break;
        case ttaomae.connectn.network.ConnectNProtocol.READY :
            this.updateMessage("Select your move");
            break;
        case ttaomae.connectn.network.ConnectNProtocol.REMATCH :
            this.updateMessage("Game Over! Rematch?");
            yesNoButtonsSetDisable(false);
            break;
        case ttaomae.connectn.network.ConnectNProtocol.NO :
            this.updateMessage("Opponent denied rematch.");
            break;
        case ttaomae.connectn.network.ConnectNProtocol.DICONNECTED :
            this.updateMessage("Opponent disconnected!");
            break;
        default :
            throw new java.lang.UnsupportedOperationException(("Unknown message: " + message));
    }
}