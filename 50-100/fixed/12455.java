public void writeByteBufferImpl(java.nio.ByteBuffer buf) throws java.io.IOException {
    int currLen = buf.remaining();
    assert null != (sChannel) : "tcp socket not set yet, null value found.";
    sChannel.write(buf);
    bufferPool.returnBuffer(buf);
    block.setNumBytes(((block.getNumBytes()) + currLen));
    bufferPool.returnBuffer(buf);
}