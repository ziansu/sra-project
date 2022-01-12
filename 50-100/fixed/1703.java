@java.lang.Override
protected void cancelled() {
    logger.debug("Subscriber cancelled, ignoring the rest of the body");
    try {
        future.done();
    } catch (java.lang.Exception t) {
        logger.debug(t.getMessage(), t);
    }
    channelManager.drainChannelAndOffer(channel, future);
    channel.pipeline().remove(org.asynchttpclient.netty.handler.StreamedResponsePublisher.class);
}