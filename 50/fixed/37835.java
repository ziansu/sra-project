public static java.lang.String readString(io.netty.buffer.ByteBuf buf) {
    int length = buf.readUnsignedShort();
    return buf.readBytes((length * 2)).toString(java.nio.charset.StandardCharsets.UTF_16BE);
}