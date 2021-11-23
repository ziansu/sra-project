private void decodeFrames(io.netty.buffer.ByteBuf in, java.util.List<java.lang.Object> out) throws java.lang.Exception {
    if ((in.readableBytes()) >= (com.mpush.api.protocol.Packet.HEADER_LEN)) {
        in.markReaderIndex();
        com.mpush.api.protocol.Packet packet = decodeFrame(in);
        if (packet != null) {
            out.add(packet);
        }else {
            in.resetReaderIndex();
        }
    }
}