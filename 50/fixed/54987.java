public java.lang.String activate(java.lang.String message) {
    com.sample.integration.SimpleActivator.logger.debug("handle message {}", message);
    return message;
}