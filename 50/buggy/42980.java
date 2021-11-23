public synchronized void sendMessage(java.lang.String message) {
    this.ws.sendBinary(message.getBytes());
}