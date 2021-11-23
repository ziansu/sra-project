public org.netlight.client.messaging.MessageBuilder put(java.lang.String name, java.lang.Object value) {
    if (org.netlight.util.CommonUtils.notNull(value)) {
        java.util.Objects.requireNonNull(name);
        message.put(name, value);
    }
    return this;
}