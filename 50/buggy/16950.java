private void setDefaults() {
    this.batchSize = PubsubProducerConfig.DEFAULT_BATCH_SIZE;
    this.isAcks = PubsubProducerConfig.DEFAULT_ACKS;
    this.perTopicBatches = java.util.Collections.synchronizedMap(new java.util.HashMap<>());
    this.maxRequestSize = PubsubProducerConfig.DEFAULT_MAX_REQUEST_SIZE;
    this.time = new org.apache.kafka.common.utils.SystemTime();
}