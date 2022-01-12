@java.lang.Override
public void copyTo(final int cacheOffset, final byte[] b, final int off, final int len) throws java.io.IOException {
    if (cacheOffset != (offset)) {
        raf.seek(cacheOffset);
        this.offset = cacheOffset;
    }
    raf.readFully(b, off, len);
}