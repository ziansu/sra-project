public void subscribe(java.lang.String... topics) {
    consumer.subscribe(topics);
    isRunning = true;
    while (isRunning) {
        java.util.Map<java.lang.String, org.apache.kafka.clients.consumer.ConsumerRecords<K, V>> records = consumer.poll(100);
        try {
            processor.process(records);
        } catch (java.lang.Exception e) {
            us.dot.its.jpo.ode.wrapper.MessageConsumer.logger.error("Error processing consumed messages", e);
        }
    } 
    consumer.close();
}