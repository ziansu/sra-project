@java.lang.Override
public long read(okio.OkBuffer sink, long byteCount) throws java.io.IOException {
    if (byteCount < 0)
        throw new java.lang.IllegalArgumentException(("byteCount < 0: " + byteCount));
    
    if (closed)
        throw new java.lang.IllegalStateException("closed");
    
    if (inputExhausted)
        return -1;
    
    long read = source.read(sink, byteCount);
    if (read == (-1)) {
        inputExhausted = true;
        endOfInput(false);
        return -1;
    }
    cacheWrite(sink, read);
    return read;
}