private void writeTime(io.netty.channel.ChannelHandlerContext ctx) {
    long timemillis = java.lang.System.currentTimeMillis();
    long seconds = timemillis / 1000;
    long deltaTimemillis = timemillis - (seconds * 1000);
    timeTx = ((seconds * 10) + (deltaTimemillis / 100)) & 65535;
    timeTxMsg = java.lang.String.format("%04x", timeTx);
    java.lang.String resp = java.lang.String.format("%d:%s", PagingMessageType.SYNCREQUEST.getValue(), timeTxMsg);
    ctx.writeAndFlush(resp);
    state = org.dapnet.core.transmission.SyncTimeHandler.SyncState.READ_TIME;
}