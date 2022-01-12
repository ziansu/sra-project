private org.springframework.messaging.Message<java.lang.String> createConnectMessage(java.lang.String sessionId) {
    org.springframework.messaging.simp.SimpMessageHeaderAccessor headers = org.springframework.messaging.simp.SimpMessageHeaderAccessor.create(SimpMessageType.CONNECT);
    headers.setSessionId(sessionId);
    headers.setUser(new org.springframework.messaging.simp.TestPrincipal("joe"));
    return org.springframework.messaging.support.MessageBuilder.createMessage("", headers.getMessageHeaders());
}