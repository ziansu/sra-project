@java.lang.Override
public com.google.common.util.concurrent.ListenableFuture<com.google.cloud.pubsub.spi.v1.MessageReceiver.AckReply> receiveMessage(com.google.pubsub.v1.PubsubMessage message) {
    if (messageCountLatch.isPresent()) {
        messageCountLatch.get().countDown();
    }
    com.google.common.util.concurrent.SettableFuture<com.google.cloud.pubsub.spi.v1.MessageReceiver.AckReply> reply = com.google.common.util.concurrent.SettableFuture.create();
    if (explicitAckReplies) {
        try {
            outstandingMessageReplies.put(reply);
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }else {
        replyTo(reply);
    }
    return reply;
}