public void sendMessage(java.lang.String dest, java.lang.String str) {
    sendString(dest, "message", str);
    listener.messageReceived(name, str);
}