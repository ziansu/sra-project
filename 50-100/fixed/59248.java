public synchronized com.google.api.gax.grpc.ChannelProvider getChannelProvider() throws java.lang.Exception {
    if ((channelProvider) == null) {
        if ((connectionFactory) != null) {
            channelProvider = connectionFactory.getChannelProvider(getExecutorProvider());
        }else {
            channelProvider = com.google.cloud.pubsub.spi.v1.TopicAdminSettings.defaultChannelProviderBuilder().setExecutorProvider(getExecutorProvider()).build();
        }
    }
    return channelProvider;
}