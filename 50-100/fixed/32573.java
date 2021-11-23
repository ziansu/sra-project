protected void sliceBuffer(java.nio.ByteBuffer original) {
    int limit = (this.type.getSizeInBytes()) * (this.count);
    this.data = ((java.nio.ByteBuffer) (original.slice().order(original.order()).limit(limit)));
}