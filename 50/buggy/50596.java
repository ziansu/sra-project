private synchronized void freeBuffer() {
    mBuffer = org.mozilla.gecko.mozglue.DirectBufferAllocator.free(mBuffer);
}