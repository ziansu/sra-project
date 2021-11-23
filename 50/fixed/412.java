public org.fressian.Writer beginOpenList() throws java.io.IOException {
    if (0 != (rawOut.getBytesWritten()))
        throw new java.lang.IllegalStateException("openList must be called from the top level, outside any footer context.");
    
    writeCode(Codes.BEGIN_OPEN_LIST);
    return this;
}