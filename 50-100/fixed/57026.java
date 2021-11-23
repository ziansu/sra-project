public void stop() {
    isAlive.set(false);
    for (org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> c : consumers.values()) {
        c.wakeup();
    }
    kafkaConsumerExecutor.shutdownNow();
    holdingBuffer.clear();
    org.apache.commons.io.IOUtils.closeQuietly(this);
}