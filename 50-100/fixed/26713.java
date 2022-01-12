public void subscribe(java.lang.String... topics) {
    consumer.subscribe(java.util.Arrays.asList(topics));
    isRunning = true;
    while (isRunning) {
        @java.lang.SuppressWarnings(value = "unchecked")
        java.util.Map<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecords<K, V>> records = ((java.util.Map<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecords<K, V>>) (consumer.poll(100)));
        try {
            processor.process(records);
        } catch (java.lang.Exception e) {
            us.dot.its.jpo.ode.wrapper.MessageConsumer.logger.error("Error processing consumed messages", e);
        }
    } 
    consumer.close();
}