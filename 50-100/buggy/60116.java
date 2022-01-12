@java.lang.Override
public void onFailure(java.lang.Throwable ex) {
    if ((getSendFailureChannel()) != null) {
        this.messagingTemplate.send(getSendFailureChannel(), this.errorMessageStrategy.buildErrorMessage(new org.springframework.integration.kafka.support.KafkaSendFailureException(message, producerRecord, ex), new org.springframework.integration.kafka.outbound.KafkaProducerMessageHandler.Attributes()));
    }
}