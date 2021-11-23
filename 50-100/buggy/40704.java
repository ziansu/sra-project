private void updateResponseInfo(final won.protocol.message.WonMessage message) {
    java.net.URI originalMessageURI = message.getIsResponseToMessageURI();
    if (originalMessageURI != null) {
        won.protocol.model.MessageEventPlaceholder event = messageEventRepository.findOneByMessageURI(originalMessageURI);
        event.setResponseMessageURI(message.getMessageURI());
        messageEventRepository.save(event);
    }
}