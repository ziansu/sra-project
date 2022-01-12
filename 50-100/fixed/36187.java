public static byte[] loadBytes(long offset, int length, java.io.RandomAccessFile raf) throws java.io.IOException {
    assert length >= 0;
    assert offset >= 0;
    raf.seek(offset);
    byte[] bytes = new byte[length];
    raf.readFully(bytes);
    return bytes;
}