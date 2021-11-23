@org.springframework.amqp.rabbit.annotation.RabbitListener(queues = ConsumerConstants.QUEUE_NAME1)
public void listerQueue1(@org.springframework.messaging.handler.annotation.Payload
java.util.Map<java.lang.String, java.lang.String> messageBody) {
    java.lang.String message = messageBody.get("message");
    my.example.amqp.consumer.FirstConsumer.LOGGER.info("Message from queue1: {}", message);
}