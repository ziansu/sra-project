public static java.lang.String decodeString(java.nio.ByteBuffer buffer) {
    int size = buffer.getInt();
    byte[] strBytes = new byte[size];
    buffer.get(strBytes, NetUtils.INT_SIZE, size);
    return new java.lang.String(strBytes, java.nio.charset.Charset.forName(org.linqs.psl.application.inference.distributed.Message.CHARSET_NAME));
}