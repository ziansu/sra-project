@java.lang.Override
public void onCompletion(org.apache.kafka.clients.producer.RecordMetadata metadata, java.lang.Exception exception) {
    if (exception == null) {
        org.apache.kafka.common.TopicPartition tp = new org.apache.kafka.common.TopicPartition(metadata.topic(), metadata.partition());
        offsets.put(tp, metadata.offset());
    }else {
        org.apache.kafka.streams.processor.internals.RecordCollector.log.error(("Error sending record: " + metadata), exception);
    }
}