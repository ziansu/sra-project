public void sendMessage() throws java.lang.InterruptedException {
    java.lang.System.out.println("Waiting five seconds...");
    java.lang.Thread.sleep(5000);
    java.lang.System.out.println("Sending message...");
    org.springframework.amqp.core.Message message = org.springframework.amqp.core.MessageBuilder.withBody("Customized Messages".getBytes()).setHeaderIfAbsent("header1", "My header").setReplyTo("something").setCorrelationId("something".getBytes()).build();
    rabbitTemplate.send(RabbitMQDemoConfig.queueName, message);
    receiver.getLatch().await(10000, java.util.concurrent.TimeUnit.MILLISECONDS);
}