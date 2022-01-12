private void warnOrError(java.lang.String message, java.lang.Exception e) {
    if (e == null) {
        org.apache.nifi.processors.kafka.pubsub.KafkaPublisher.logger.warn(message);
        if ((this.processLog) != null) {
            this.processLog.warn(message);
        }
    }else {
        org.apache.nifi.processors.kafka.pubsub.KafkaPublisher.logger.error(message, e);
        if ((this.processLog) != null) {
            this.processLog.error(message, e);
        }
    }
}