public kr.co.bitnine.octopus.postgres.libpq.Message.Builder putBytes(byte[] bytes) {
    kr.co.bitnine.octopus.postgres.libpq.ByteBuffers.enlargeByteBuffer(buf, bytes.length);
    buf.put(bytes);
    return this;
}