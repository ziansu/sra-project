private static kafka.consumer.ConsumerConfig createConsumerConfig(java.lang.String zkConnect, java.lang.String groupId) {
    java.util.Properties props = new java.util.Properties();
    props.put("zookeeper.connect", zkConnect);
    props.put("group.id", groupId);
    props.put("zookeeper.session.timeout.ms", "400");
    props.put("zookeeper.sync.time.ms", "200");
    props.put("auto.commit.interval.ms", "1000");
    props.put("fetch.min.bytes", 1);
    return new kafka.consumer.ConsumerConfig(props);
}