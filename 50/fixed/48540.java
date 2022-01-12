public void requestSendMessage(java.lang.String chatroom, java.lang.String message) {
    try {
        chatClient.getChatServerThread().writeToServer(new de.haw_chat.client.controllers.MessageSendPacket(message));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}