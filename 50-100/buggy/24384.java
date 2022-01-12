public void operationComplete(org.jboss.netty.channel.ChannelFuture future) throws java.lang.Exception {
    if (!(future.isSuccess())) {
        com.alibaba.jstorm.message.netty.StormClientHandler.LOG.warn("Failed to send requests:", future.getCause());
        future.getChannel().close();
    }else {
    }
    if (being_closed.get()) {
        client.close_n_release();
    }
}