private boolean asyncSendAcknowledge(com.sun.messaging.jmq.jmsclient.ReadWritePacket pkt) {
    boolean synchronousReply = protocolHandler.isDirectModeTwoThreadWithSyncReplies();
    if (synchronousReply) {
        return true;
    }
    long ackId = pkt.getConsumerID();
    com.sun.messaging.jmq.jmsclient.AsyncSendCallback cb = ((com.sun.messaging.jmq.jmsclient.AsyncSendCallback) (requestMetaData.get(java.lang.Long.valueOf(ackId))));
    requestMetaData.remove(ackId);
    if (cb == null) {
        return false;
    }
    cb.processCompletion(pkt, true);
    return true;
}