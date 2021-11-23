public void flush() {
    com.google.pubsub.clients.producer.PubsubProducer.log.debug("Flushing...");
    for (java.lang.String topic : perTopicBatches.keySet()) {
        com.google.pubsub.v1.PublishRequest request = com.google.pubsub.v1.PublishRequest.newBuilder().setTopic(java.lang.String.format(channelUtil.CPS_TOPIC_FORMAT, project, topic)).addAllMessages(perTopicBatches.get(topic)).build();
        doSend(request, null, null);
    }
}