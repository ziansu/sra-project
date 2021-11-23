public void createTopic(java.lang.String topic, int clusterId, int numOfPartitions) {
    createTopic(topic, zkUtils[clusterId], numOfPartitions);
    java.util.List<kafka.server.KafkaServer> servers = new java.util.ArrayList<kafka.server.KafkaServer>();
    servers.add(kafkaServer[clusterId]);
    kafka.utils.TestUtils.waitUntilMetadataIsPropagated(scala.collection.JavaConversions.asScalaBuffer(servers), topic, 0, 30000);
}