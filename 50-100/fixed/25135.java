void request(int numMessages) {
    com.google.common.base.Preconditions.checkArgument((numMessages > 0), "numMessages must be > 0");
    if (isClosed()) {
        return ;
    }
    transportCount.addAndGet(numMessages);
    requestedMessageCount += numMessages;
    if ((messagesAvailable) && (!(appInRequest))) {
        appInRequest = true;
        try {
            listener.messagesAvailable(this);
        } finally {
            appInRequest = false;
        }
    }
}