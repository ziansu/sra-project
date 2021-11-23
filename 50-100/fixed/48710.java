public static java.lang.String printBytes(io.netty.buffer.ByteBuf buffer, int start, int length) {
    java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
    for (int i = start; i < (start + length); i++) {
        sb.append(java.lang.String.format("%%%02x", buffer.getByte(i)));
    }
    return sb.toString();
}