@java.lang.Override
public void run() {
    try (org.apache.kafka.clients.producer.KafkaProducer<java.lang.String, java.lang.String> producer = new org.apache.kafka.clients.producer.KafkaProducer(Config.KAFKA_CONFIGURATION)) {
        while (true) {
            if (running) {
                long message_count = benchmark(producer);
            }
        } 
    }
}