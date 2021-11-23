public static com.hazelcast.jet.function.DistributedSupplier<com.hazelcast.jet.Processor> streamKafka(java.util.Properties properties, java.lang.String... topics) {
    com.hazelcast.util.Preconditions.checkPositive(topics.length, "At least one topic must be supplied");
    com.hazelcast.util.Preconditions.checkTrue(properties.containsKey("group.id"), "Properties should contain `group.id`");
    properties.put("enable.auto.commit", false);
    return () -> new com.hazelcast.jet.impl.connector.kafka.StreamKafkaP(topics, properties);
}