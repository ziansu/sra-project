public void handleInputMessage(java.lang.String messageLine) {
    channel.Message m = new channel.Message(messageLine);
    try {
        this.node.handleMessage(m);
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    this.node.sent = true;
}