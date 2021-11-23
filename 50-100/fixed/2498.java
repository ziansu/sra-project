public synchronized void start() {
    org.apache.kafka.streams.KafkaStreams.log.debug("Starting Kafka Stream process");
    if ((state) == (org.apache.kafka.streams.KafkaStreams.State.CREATED)) {
        setState(org.apache.kafka.streams.KafkaStreams.State.RUNNING);
        for (final org.apache.kafka.streams.processor.internals.StreamThread thread : threads) {
            thread.start();
        }
        org.apache.kafka.streams.KafkaStreams.log.info("Started Kafka Stream process");
    }else {
        throw new java.lang.IllegalStateException("Cannot start again.");
    }
}