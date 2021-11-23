public org.netlight.client.messaging.MessageBuilder put(java.lang.String name, java.lang.Object value) {
    java.util.Objects.requireNonNull(name);
    if (org.netlight.util.CommonUtils.notNull(value)) {
        message.put(name, value);
    }
    return this;
}