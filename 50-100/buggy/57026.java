public void stop() {
    for (org.apache.kafka.clients.consumer.KafkaConsumer<byte[], byte[]> c : consumers.values()) {
        c.wakeup();
    }
    kafkaConsumerExecutor.shutdownNow();
    isAlive = false;
    holdingBuffer.clear();
    org.apache.commons.io.IOUtils.closeQuietly(this);
}