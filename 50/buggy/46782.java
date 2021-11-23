@java.lang.Override
public void writeBuffer(java.nio.ByteBuffer byteBuffer) {
    int remaining = java.lang.Math.min(byteBuffer.remaining(), writableBytes());
    writeBuffer(byteBuffer, byteBuffer.position(), remaining);
}