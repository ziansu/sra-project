@java.lang.Override
public void receiveMessage(com.google.pubsub.v1.PubsubMessage message, com.google.common.util.concurrent.SettableFuture<com.google.cloud.pubsub.spi.v1.MessageReceiver.AckReply> response) {
    if (messageCountLatch.isPresent()) {
        messageCountLatch.get().countDown();
    }
    if (explicitAckReplies) {
        try {
            outstandingMessageReplies.put(response);
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }else {
        replyTo(response);
    }
}