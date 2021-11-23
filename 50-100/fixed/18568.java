private long getInitialOffset(org.springframework.integration.kafka.core.KafkaTemplate template, java.lang.String topicName) {
    try {
        org.springframework.integration.kafka.core.Partition partition = new org.springframework.integration.kafka.core.Partition(org.springframework.xd.dirt.integration.kafka.KafkaMessageBus.escapeTopicName(topicName), 0);
        org.springframework.integration.kafka.core.BrokerAddress leader = template.getConnectionFactory().getLeader(partition);
        return template.getConnectionFactory().connect(leader).fetchInitialOffset(kafka.api.OffsetRequest.LatestTime(), partition).getResult(partition);
    } catch (org.springframework.integration.kafka.core.PartitionNotFoundException e) {
        return 0;
    }
}