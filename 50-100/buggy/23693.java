protected java.lang.String logPrefix() {
    if ((logPrefix) != null) {
        return logPrefix;
    }
    java.lang.StringBuffer buffer = new java.lang.StringBuffer(64);
    buffer.append('[').append("chid=0x").append(java.lang.Long.toHexString(commandHandlerId)).append(", ").append(com.lambdaworks.redis.protocol.ChannelLogDescriptor.logDescriptor(channel)).append(']');
    return logPrefix = buffer.toString();
}