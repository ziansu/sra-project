public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putChar(char c) {
    kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, ByteBuffers.BYTE_BYTES);
    buf.put(((byte) (c)));
    return this;
}