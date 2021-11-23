protected java.nio.ByteBuffer allocateByteBuffer(int size) {
    java.nio.ByteBuffer fileBufferSlice = this.fileBuffer.slice();
    fileBufferSlice.limit(size);
    this.fileBuffer.position(((this.fileBuffer.position()) + size));
    return fileBufferSlice;
}