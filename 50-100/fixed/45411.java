@java.lang.Override
public java.nio.ByteBuffer readByteBuffer() throws java.io.IOException {
    int sizeInBytes = readI32();
    if (((stringLengthLimit) != (-1)) && (sizeInBytes > (stringLengthLimit))) {
        throw new java.net.ProtocolException("Binary size limit exceeded");
    }
    byte[] byteArray = source.readByteArray(sizeInBytes);
    return java.nio.ByteBuffer.wrap(byteArray);
}