public void sendEventCreatedMessage(final net.chris.outbound.EventCreatedMessage message) {
    java.lang.System.out.println(("Publishing to topic:" + message));
    jmsTemplate.convertAndSend(message);
}