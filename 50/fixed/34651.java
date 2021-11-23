public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putInt(int i) {
    buf = kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, ByteBuffers.INTEGER_BYTES);
    buf.putInt(i);
    return this;
}