public void handleEventPostResponse(com.splunk.logging.EventPostResponse epr, com.splunk.logging.EventBatch events) {
    java.lang.Long ackId = epr.getAckId();
    postedEventBatches.remove(events.getId());
    polledAcks.put(ackId, events);
    channelMetrics.ackIdCreated(ackId, events);
}