public int nextMessageId() {
    synchronized(this) {
        currentMessageId = (currentMessageId) + 1;
        if ((currentMessageId) > (net.anyflow.lannister.session.Session.MAX_MESSAGE_ID_NUM)) {
            currentMessageId = net.anyflow.lannister.session.Session.MIN_MESSAGE_ID_NUM;
        }
        synchronize();
        return currentMessageId;
    }
}