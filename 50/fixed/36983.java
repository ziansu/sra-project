private org.ametiste.scm.messaging.sender.client.EventSenderClient shutdownEventSenderClient() throws java.net.URISyntaxException {
    return new org.ametiste.scm.messaging.sender.client.EventSenderClient(shutdownEventFactory, eventSender, org.ametiste.scm.messaging.sender.client.config.MessagingClientsConfiguration.safeUri(clientProps.getTargetUri()), clientProps.isStrict());
}