public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putCString(java.lang.String s) {
    byte[] bytes = s.getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    buf = kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, bytes.length);
    buf.put(bytes);
    putChar(' ');
    return this;
}