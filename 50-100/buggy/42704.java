private void handleKMessage(socket.SocketInMessage message) {
    switch (message.getMessage()) {
        case "1" :
            this.keyState = KeyState.K1;
            break;
        case "2" :
            this.keyState = KeyState.K2;
            break;
        case "3" :
            this.keyState = KeyState.K3;
        case "4" :
            this.keyState = KeyState.K4;
        default :
            socketHandler.sendMessage(new socket.SocketOutMessage("ES"));
            break;
    }
}