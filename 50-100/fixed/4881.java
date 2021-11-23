@java.lang.Override
public void subscribe(java.util.regex.Pattern pattern, org.apache.kafka.clients.consumer.ConsumerRebalanceListener listener) {
    acquire();
    try {
        if (pattern == null)
            throw new java.lang.IllegalArgumentException("Topic pattern to subscribe to cannot be null");
        
        org.apache.kafka.clients.consumer.KafkaConsumer.log.debug("Subscribed to pattern: {}", pattern);
        this.subscriptions.subscribe(pattern, listener);
        this.metadata.needMetadataForAllTopics(true);
        this.coordinator.updatePatternSubscription(metadata.fetch());
        this.metadata.requestUpdate();
    } finally {
        release();
    }
}