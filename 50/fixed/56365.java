private java.lang.String getClusterConfig() {
    return (org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.kafkaServer.getBroker(0)) + (hasMultiCluster ? ";" + (org.apache.apex.malhar.kafka.AbstractKafkaInputOperatorTest.kafkaServer.getBroker(1)) : "");
}