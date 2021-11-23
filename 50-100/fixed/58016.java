private void parseIdentification(org.jboss.netty.channel.Channel channel, org.jboss.netty.buffer.ChannelBuffer buf) {
    int length = buf.readUnsignedShort();
    java.lang.String imei = buf.toString(buf.readerIndex(), length, java.nio.charset.Charset.defaultCharset());
    boolean result = identify(imei);
    if (channel != null) {
        org.jboss.netty.buffer.ChannelBuffer response = org.jboss.netty.buffer.ChannelBuffers.directBuffer(1);
        response.writeByte((result ? 1 : 0));
        channel.write(response);
    }
}