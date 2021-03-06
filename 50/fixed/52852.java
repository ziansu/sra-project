public void responseDone(io.netty.channel.ChannelFuture future, boolean close) {
    if (!close) {
        synchronized(openChannels) {
            openChannels.offer(future);
        }
    }else {
        if (future != null) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }
}