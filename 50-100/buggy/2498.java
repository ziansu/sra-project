public synchronized void start() {
    org.apache.kafka.streams.KafkaStreams.log.debug("Starting Kafka Stream process");
    if ((state) == (org.apache.kafka.streams.KafkaStreams.State.CREATED)) {
        for (final org.apache.kafka.streams.processor.internals.StreamThread thread : threads)
            thread.start();
        
        setState(org.apache.kafka.streams.KafkaStreams.State.RUNNING);
        org.apache.kafka.streams.KafkaStreams.log.info("Started Kafka Stream process");
    }else {
        throw new java.lang.IllegalStateException("Cannot start again.");
    }
}