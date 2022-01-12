private void sendQueue() {
    if ((sendingQueue.size()) > 0) {
        ch.dissem.bitmessage.networking.Connection.LOG.debug(((("Sending " + (sendingQueue.size())) + " messages to node ") + (node)));
    }
    for (ch.dissem.bitmessage.networking.MessagePayload msg = sendingQueue.poll(); msg != null; msg = sendingQueue.poll()) {
        send(msg);
    }
}