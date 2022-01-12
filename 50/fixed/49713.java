public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putBytes(byte[] bytes) {
    buf = kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, bytes.length);
    buf.put(bytes);
    return this;
}