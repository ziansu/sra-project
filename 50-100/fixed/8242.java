@java.lang.Override
public void commitWatermarks(java.lang.Iterable<gobblin.source.extractor.CheckpointableWatermark> watermarks) {
    java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.kafka.clients.consumer.OffsetAndMetadata> wmToCommit = new java.util.HashMap<org.apache.kafka.common.TopicPartition, org.apache.kafka.clients.consumer.OffsetAndMetadata>();
    for (gobblin.source.extractor.CheckpointableWatermark cwm : watermarks) {
        com.google.common.base.Preconditions.checkArgument((cwm instanceof gobblin.source.extractor.extract.kafka.KafkaSimpleStreamingExtractor.KafkaWatermark));
        gobblin.source.extractor.extract.kafka.KafkaSimpleStreamingExtractor.KafkaWatermark kwm = ((gobblin.source.extractor.extract.kafka.KafkaSimpleStreamingExtractor.KafkaWatermark) (cwm));
        wmToCommit.put(kwm.getTopicPartition(), new org.apache.kafka.clients.consumer.OffsetAndMetadata(kwm.getLwm().getValue()));
    }
    _consumer.commitSync(wmToCommit);
}