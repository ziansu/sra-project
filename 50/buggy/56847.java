public void sendStringMessage() throws java.lang.InterruptedException {
    java.lang.System.out.println("Waiting five seconds...");
    java.lang.Thread.sleep(5000);
    java.lang.System.out.println("Sending message...");
    rabbitTemplate.convertAndSend(RabbitMQDemoConfig.queueName, "Hello from RabbitMQ!");
    receiver.getLatch().await(10000, java.util.concurrent.TimeUnit.MILLISECONDS);
}