public void checkKafkaOffsets() {
    try {
        long currentOffset = kafkaConsumerClient.fetchCurrentOffsetFromKafka();
        long earliestOffset = kafkaConsumerClient.getEarliestOffset();
        long latestOffset = kafkaConsumerClient.getLastestOffset();
        org.elasticsearch.kafka.indexer.jobs.IndexerJob.logger.info("Kafka offsets: currentOffset={}; earliestOffset={}; latestOffset={} for partition {}", currentOffset, earliestOffset, latestOffset, currentPartition);
    } catch (java.lang.Exception e) {
        org.elasticsearch.kafka.indexer.jobs.IndexerJob.logger.warn("Exception from checkKafkaOffsets(): for partition {}", currentPartition, e);
        e.printStackTrace();
    }
}