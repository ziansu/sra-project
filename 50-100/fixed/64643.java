public void send(java.lang.String json) {
    java.util.concurrent.Future<org.apache.kafka.clients.producer.RecordMetadata> future = producer.send(new org.apache.kafka.clients.producer.ProducerRecord<java.lang.String, java.lang.String>(topic, json));
    try {
        future.get(30, java.util.concurrent.TimeUnit.SECONDS);
    } catch (java.lang.Exception e) {
        throw com.google.common.base.Throwables.propagate(e);
    }
}