@java.lang.Override
public void writeBuffer(java.nio.ByteBuffer byteBuffer, int offset, int length) {
    if (byteBuffer.hasArray()) {
        writeBytes(byteBuffer.array(), offset, length);
    }else {
        for (int pos = offset; pos < (offset + length); pos++) {
            writeByte(byteBuffer.get(offset));
        }
    }
}