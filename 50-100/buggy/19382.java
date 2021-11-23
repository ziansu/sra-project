private void send(java.lang.String message, java.util.Map<java.lang.String, java.lang.String> headers) {
    org.apache.flume.channel.ChannelProcessor channelProcessor = getChannelProcessor();
    sourceCounter.addToEventReceivedCount(1);
    sourceCounter.incrementAppendBatchReceivedCount();
    channelProcessor.processEvent(org.apache.flume.event.EventBuilder.withBody(message, com.google.common.base.Charsets.UTF_8, headers));
    sourceCounter.addToEventAcceptedCount(1);
    sourceCounter.incrementAppendBatchAcceptedCount();
    headers.clear();
}