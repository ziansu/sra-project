private void handleLogin(Message message) {
    try {
        if (databaseHandler.userLogin(message)) {
            sendMessage(new Message(MessageType.LOGIN, true));
        }else
            if (!(databaseHandler.userLogin(message))) {
                sendMessage(new Message(MessageType.LOGIN, false));
            }
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}