public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putShort(short h) {
    buf = kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, ByteBuffers.SHORT_BYTES);
    buf.putShort(h);
    return this;
}