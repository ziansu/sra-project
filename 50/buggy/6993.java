public boolean isClosed() {
    return (messageInputStream.isClosed()) && (((currentByteBuffer) == null) || ((currentByteBuffer.hasRemaining()) == false));
}