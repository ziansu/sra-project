void write(jazmin.server.rpc.RpcMessage message) {
    if ((channel) != null) {
        message.sentTime = java.lang.System.currentTimeMillis();
        channel.writeAndFlush(message);
        sentPackageCount.increment();
    }
}