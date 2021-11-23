@java.lang.Override
public void onOpen() {
    org.phoenixframework.channels.Channel channel = mSocket.chan(channelName, null);
    listener.onOpen(channel);
    mIsConnected.set(true);
}