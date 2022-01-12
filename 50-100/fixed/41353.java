@java.lang.Override
public void sendMessage(final com.hokee.hermes.models.User sender, final com.hokee.hermes.models.Contact recipient, final java.lang.String message) {
    final com.hokee.shared.SendMessageInput body = new com.hokee.shared.SendMessageInput(sender.getId(), recipient.getId(), message);
    org.springframework.http.HttpEntity<com.hokee.shared.SendMessageInput> request = new org.springframework.http.HttpEntity(body, buildHeaders());
    final com.hokee.shared.SendMessageOutput result = _restTemplate.postForEntity(_config.getSendMessageAPIEndpoint(), request, com.hokee.shared.SendMessageOutput.class).getBody();
}