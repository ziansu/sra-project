private void createChannel() {
    if ((channel) == null) {
        channel = servletRequestContext.getExchange().getResponseChannel();
        if ((internalListener) != null) {
            channel.getWriteSetter().set(internalListener);
        }
    }
}