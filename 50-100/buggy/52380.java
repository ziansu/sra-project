private kafka.javaapi.message.ByteBufferMessageSet getLastMessage() {
    long offsetOfLastMessage = storm.kafka.KafkaUtils.getOffset(simpleConsumer, config.topic, 0, kafka.api.OffsetRequest.LatestTime());
    return storm.kafka.KafkaUtils.fetchMessages(config, simpleConsumer, new storm.kafka.Partition(storm.kafka.Broker.fromString(broker.getBrokerConnectionString()), 0), offsetOfLastMessage);
}