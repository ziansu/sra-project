public synchronized void tryEnqueue(java.lang.String rawMessage) {
    network.models.JSONMessageResponse.Message message = network.groupme.GroupMeRequester.getMessageFromString(rawMessage);
    if (message != null) {
        messageQueue.offer(message);
        notify();
    }
}