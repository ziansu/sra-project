protected org.springframework.messaging.Message<java.lang.String> createSubscriptionMessage(java.lang.String sessionId, java.lang.String subcriptionId, java.lang.String destination) {
    org.springframework.messaging.simp.SimpMessageHeaderAccessor headers = org.springframework.messaging.simp.SimpMessageHeaderAccessor.create(SimpMessageType.SUBSCRIBE);
    headers.setSubscriptionId(subcriptionId);
    headers.setDestination(destination);
    headers.setSessionId(sessionId);
    return org.springframework.messaging.support.MessageBuilder.createMessage("", headers.getMessageHeaders());
}