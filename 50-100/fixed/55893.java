@java.lang.Override
public void onCompletion(org.apache.kafka.clients.producer.RecordMetadata metadata, java.lang.Exception ex) {
    if (ex == null) {
        sendCompletedCounter.incrementAndGet();
    }else {
        com.tutu.flume.kafka.KafkaSendCallback.logger.debug("send event {} failed.", index);
        bSendFailed.set(false);
        ex.printStackTrace();
    }
}