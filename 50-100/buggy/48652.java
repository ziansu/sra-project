private java.nio.ByteBuffer[] toBuffers(byte[][] bytes) {
    java.nio.ByteBuffer[] buffers = new java.nio.ByteBuffer[bytes.length];
    for (int i = 0; i < (buffers.length); i++) {
        buffers[i] = java.nio.ByteBuffer.allocateDirect(org.apache.hadoop.io.ec.rawcoder.TestXorRawEncoder.CHUNK_SIZE);
        buffers[i].put(bytes[i]);
        buffers[i].flip();
    }
    return buffers;
}