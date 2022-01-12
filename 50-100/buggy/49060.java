protected java.lang.String logPrefix() {
    if ((logPrefix) != null) {
        return logPrefix;
    }
    java.lang.StringBuilder buffer = new java.lang.StringBuilder(64);
    buffer.append('[').append("chid=0x").append(java.lang.Long.toHexString(commandHandlerId)).append(", ").append(io.lettuce.core.protocol.ChannelLogDescriptor.logDescriptor(channel)).append(']');
    return logPrefix = buffer.toString();
}