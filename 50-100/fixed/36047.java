@java.lang.Override
public java.nio.ByteBuffer readByteBuffer(java.lang.String filePath, long offset, int length) throws java.io.IOException {
    byte[] readByteArray = readByteArray(filePath, offset, length);
    java.nio.ByteBuffer byteBuffer = java.nio.ByteBuffer.wrap(readByteArray);
    byteBuffer.rewind();
    return byteBuffer;
}