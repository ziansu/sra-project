public static com.sailing.kafka.KafkaClient getKafkaProducer(java.lang.String kafkaName, java.util.Properties kafkaProducerProps) {
    com.sailing.kafka.KafkaClient client = com.sailing.kafka.KafkaSet.kafkaMap.get(kafkaName);
    if (client == null) {
        client = new com.sailing.kafka.KafkaClient(kafkaProducerProps);
        com.sailing.kafka.KafkaClient clientTrue = com.sailing.kafka.KafkaSet.kafkaMap.putIfAbsent(kafkaName, client);
        if (client != clientTrue) {
            client.close();
        }
        return clientTrue;
    }
    return client;
}