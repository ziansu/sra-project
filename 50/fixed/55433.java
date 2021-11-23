private java.lang.Boolean isEditableMessage(org.esbtools.message.admin.model.EsbMessage message) {
    if ((message.getMessageType()) == null) {
        return false;
    }
    return org.esbtools.message.admin.common.config.EMAConfiguration.getEditableMessageTypes().contains(message.getMessageType().toUpperCase());
}