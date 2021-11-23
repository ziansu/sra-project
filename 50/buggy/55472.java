private void processWindowSizeFrame(org.jboss.netty.buffer.ChannelBuffer channelBuffer) {
    if ((channelBuffer.readableBytes()) < 4) {
        channelBuffer.resetReaderIndex();
    }else {
        windowSize = channelBuffer.readUnsignedInt();
        org.graylog.plugins.beats.BeatsFrameDecoder.LOG.trace("Changed window size to {}", windowSize);
    }
}