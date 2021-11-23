public void handleMessage(io.netty.channel.ChannelHandlerContext ctx, java.lang.String message) throws java.lang.Exception {
    switch (state) {
        case WRITE_TIME :
            writeTime(ctx, message);
            break;
        case READ_TIME :
            readTime(message);
            break;
        case READ_TIME_ACK :
            readTimeAck(ctx, message);
        case READ_TIME_ADJUST_ACK :
            if (message.equals("+")) {
                state = org.dapnet.core.transmission.SyncTimeHandler.SyncState.DONE;
            }else {
                throw new org.dapnet.core.transmission.TransmitterDeviceException("Wrong ack received.");
            }
            break;
        default :
            break;
    }
}