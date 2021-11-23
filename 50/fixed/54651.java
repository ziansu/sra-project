protected void fixedError(java.lang.String message, boolean updateMessages, java.lang.Object... parameters) {
    org.omnifaces.util.Messages.addError(null, this.messagesFactory.getMessage(message), parameters);
    if (updateMessages) {
        this.updateMessages(false);
    }
}