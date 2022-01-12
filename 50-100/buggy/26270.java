private org.jboss.netty.buffer.ChannelBuffer[] parseJsonFrame(org.jboss.netty.channel.Channel channel, org.jboss.netty.buffer.ChannelBuffer channelBuffer) throws java.io.IOException {
    if ((channelBuffer.readableBytes()) >= 4) {
        sequenceNum = channelBuffer.readUnsignedInt();
        org.graylog.plugins.beats.BeatsFrameDecoder.LOG.trace("Received sequence number {}", sequenceNum);
        final int jsonLength = com.google.common.primitives.Ints.saturatedCast(channelBuffer.readUnsignedInt());
        final org.jboss.netty.buffer.ChannelBuffer buffer = channelBuffer.readSlice(jsonLength);
        sendACK(channel);
        return new org.jboss.netty.buffer.ChannelBuffer[]{ buffer };
    }
    return null;
}