private void discardMessage(org.springframework.messaging.Message<?> message) {
    this.messagingTemplate.send(getDiscardChannel(), message);
}