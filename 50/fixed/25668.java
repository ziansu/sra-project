@java.lang.Override
public void write(byte[] b, int off, int len) throws java.io.IOException {
    tachyon.underfs.swift.direct.SwiftDirectOutputStream.LOG.trace("write, off: {}, len: {}", off, len);
    mOutputStream.write(b, off, len);
}