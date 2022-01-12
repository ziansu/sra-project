public void stop() throws com.bea.wli.sb.transports.TransportException {
    if (isInbound()) {
        for (oracle.ateam.sb.transports.kafka.KafkaEndpoint.InternalConsumer consumer : internalConsumers) {
            consumer.shutdown();
        }
        internalConsumers.clear();
    }else {
        if ((producer) != null) {
            producer.close();
        }
    }
}