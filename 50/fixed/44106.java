@java.lang.Override
public void write(byte[] b) throws java.io.IOException {
    tachyon.underfs.swift.direct.SwiftDirectOutputStream.LOG.trace("write byte array");
    mOutputStream.write(b);
}