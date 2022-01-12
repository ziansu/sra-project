private kafka.consumer.ConsumerConfig createConsumerConfig(java.lang.String zookeeper, java.lang.String groupId) {
    java.util.Properties props = new java.util.Properties();
    props.put("zookeeper.connect", zookeeper);
    props.put("group.id", groupId);
    props.put("offsets.storage", "kafka");
    props.put("dual.commit.enabled", "false");
    props.put("zookeeper.session.timeout.ms", "kafka");
    props.put("zookeeper.session.timeout.ms", "400");
    props.put("zookeeper.sync.time.ms", "200");
    props.put("auto.commit.interval.ms", "1000");
    return new kafka.consumer.ConsumerConfig(props);
}