protected java.nio.ByteBuffer allocateByteBuffer(int size) {
    java.nio.ByteBuffer fileBufferSlice = this.fileBuffer.slice();
    fileBufferSlice.limit(chunkSize);
    this.fileBuffer.position(((this.fileBuffer.position()) + (chunkSize)));
    return fileBufferSlice;
}