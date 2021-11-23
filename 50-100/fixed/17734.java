protected void copy(java.io.InputStream in, java.io.OutputStream out, int bufferSize) throws java.io.IOException {
    byte[] buff = new byte[bufferSize <= 0 ? 4 * 1024 : bufferSize];
    int len;
    while ((-1) != (len = in.read(buff))) {
        out.write(buff, 0, len);
    } 
}