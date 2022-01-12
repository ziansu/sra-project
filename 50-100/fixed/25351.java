public static synchronized void closeChannel(java.lang.String channelName, org.jgroups.JChannel channel) {
    channel.setReceiver(null);
    channel.disconnect();
    channel.close();
    org.hornetq.api.core.JGroupsBroadcastGroupConfiguration.JGroupsBroadcastEndpoint.JChannelWrapper<?> wrapper = org.hornetq.api.core.JGroupsBroadcastGroupConfiguration.JGroupsBroadcastEndpoint.JChannelManager.channels.remove(channelName);
    if (wrapper == null) {
        throw new java.lang.IllegalStateException(("Did not find channel " + channelName));
    }
}