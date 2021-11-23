public static byte[] readArray(io.netty.buffer.ByteBuf buf) {
    return buf.readBytes(buf.readShort()).array();
}