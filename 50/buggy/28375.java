public <T> T readMessage(java.net.Socket s) {
    return com.netboard.message.CommsBridge.readMessage(s);
}