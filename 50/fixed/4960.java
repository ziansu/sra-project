@java.lang.Override
public void operationComplete(org.kiteq.remoting.client.impl.ChannelFuture future) throws java.lang.Exception {
    if (future.isSuccess()) {
        state.set(org.kiteq.remoting.client.impl.NettyKiteIOClient.STATE.RECOVERING);
    }
}