@java.lang.Override
public void downstreamOpened(org.kaazing.gateway.client.impl.wseb.DownstreamChannel channel) {
    org.kaazing.gateway.client.impl.wseb.WebSocketEmulatedChannel wsebChannel = ((org.kaazing.gateway.client.impl.wseb.WebSocketEmulatedChannel) (channel.getParent()));
    listener.connectionOpened(wsebChannel, wsebChannel.getProtocol());
}