@java.lang.Override
public void fail(java.lang.Object messageId) {
    final org.apache.storm.kafka.spout.KafkaSpoutMessageId msgId = ((org.apache.storm.kafka.spout.KafkaSpoutMessageId) (messageId));
    if (!(emitted.contains(msgId))) {
        org.apache.storm.kafka.spout.KafkaSpout.LOG.debug(("Received fail for tuple this spout is no longer tracking." + " Partitions may have been reassigned. Ignoring message [{}]"), msgId);
        return ;
    }
    msgId.incrementNumFails();
    if (!(retryService.schedule(msgId))) {
        org.apache.storm.kafka.spout.KafkaSpout.LOG.debug("Reached maximum number of retries. Message [{}] being marked as acked.", msgId);
        ack(msgId);
    }else {
        emitted.remove(msgId);
    }
}