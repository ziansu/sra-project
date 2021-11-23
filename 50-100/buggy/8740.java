private void createChannel() {
    if ((channel) == null) {
        channel = servletRequestContext.getExchange().getResponseChannel();
        channel.getWriteSetter().set(internalListener);
        if ((internalListener) != null) {
            channel.resumeWrites();
        }
    }
}