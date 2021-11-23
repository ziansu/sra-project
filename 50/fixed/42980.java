public synchronized void sendMessage(java.lang.String message) {
    if ((this.ws) == null) {
        return ;
    }
    this.ws.sendBinary(message.getBytes());
}