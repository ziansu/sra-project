public void handleRequest(edu.tomr.protocol.DBMessage message) {
    clientInbox.queueMessage(new edu.tomr.protocol.ClientMessage(message));
    if (null == (clientProcThread)) {
        startClientProcessor();
    }
}