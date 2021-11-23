@java.lang.Override
public void writeBuffer(java.nio.ByteBuffer byteBuffer) {
    int remaining = java.lang.Math.min(byteBuffer.position(), writableBytes());
    writeBuffer(byteBuffer, 0, remaining);
}