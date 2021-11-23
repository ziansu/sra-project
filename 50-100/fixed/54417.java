@java.lang.Override
public org.verapdf.as.io.ASInputStream getStream(long startOffset, long length) throws java.io.IOException {
    if (((startOffset > 0) && (startOffset < (this.bufferSize))) && ((startOffset + length) <= (this.bufferSize))) {
        return new org.verapdf.as.io.ASMemoryInStream(this, ((int) (startOffset)), ((int) (length)));
    }else {
        throw new java.io.IOException();
    }
}