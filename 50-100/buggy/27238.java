@java.lang.Override
protected final io.netty.buffer.ByteBuf allocateBuffer(io.netty.channel.ChannelHandlerContext ctx, io.netty.buffer.ByteBuf msg, boolean preferDirect) throws java.lang.Exception {
    int sizeEstimate = ((int) (java.lang.Math.ceil(((msg.readableBytes()) * 1.001)))) + 12;
    if (writeHeader) {
        switch (wrapper) {
            case GZIP :
                sizeEstimate += io.netty.handler.codec.compression.JdkZlibEncoder.gzipHeader.length;
                break;
            case ZLIB :
                sizeEstimate += 2;
                break;
        }
    }
    return ctx.alloc().heapBuffer(sizeEstimate);
}