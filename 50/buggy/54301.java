@java.lang.Override
public byte readByte() throws java.io.IOException {
    assert (java.lang.Byte.BYTES) == 1;
    byte[] b = readFully(1);
    return b[0];
}