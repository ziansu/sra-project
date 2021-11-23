private void processWindowSizeFrame(org.jboss.netty.buffer.ChannelBuffer channelBuffer) {
    windowSize = channelBuffer.readUnsignedInt();
    org.graylog.plugins.beats.BeatsFrameDecoder.LOG.trace("Changed window size to {}", windowSize);
}