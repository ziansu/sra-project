@java.lang.Override
public void onCompletion(org.apache.kafka.clients.producer.RecordMetadata metadata, java.lang.Exception ex) {
    if (ex == null) {
        if (com.tutu.flume.kafka.KafkaSendCallback.logger.isDebugEnabled()) {
            com.tutu.flume.kafka.KafkaSendCallback.logger.debug(java.lang.String.format("send event %d success,topic:%s,partition:%d,offset:%d", index, metadata.topic(), metadata.partition(), metadata.offset()));
        }
        sendCompletedCounter.incrementAndGet();
    }else {
        com.tutu.flume.kafka.KafkaSendCallback.logger.debug("send event {} failed.", index);
        bSendFailed.set(false);
        ex.printStackTrace();
    }
}