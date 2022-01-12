public void handleRequest(edu.tomr.protocol.DBMessage message, java.lang.String originalServicerIP) {
    requestMapper.put(message.getRequestId(), originalServicerIP);
    if (null != originalServicerIP) {
        nodeInbox.queueMessage(new edu.tomr.protocol.NodeMessage(message, originalServicerIP));
        if (!(nodeProcThread.isAlive()))
            startNodeProcessor();
        
    }
}