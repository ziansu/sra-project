@java.lang.Override
public int read(byte[] b, int off, int len) throws java.io.IOException {
    if ((offset) >= (raf.length())) {
        return -1;
    }
    raf.seek(offset);
    int readLen = raf.read(b, (off - (offset)), len);
    if (readLen != (-1)) {
        offset += readLen;
    }
    return readLen;
}