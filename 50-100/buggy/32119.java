@poker.OnWebSocketMessage
public void handleMessage(java.lang.String message) {
    if (message.substring(((message.length()) - 4), message.length()).equals("chat")) {
        player.receiveChatMessage(message);
    }else {
        player.receiveMessage(message);
    }
}