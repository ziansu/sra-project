@java.lang.Override
public int read() throws java.io.IOException {
    byte[] buffer = new byte[1];
    stream.read(buffer);
    return buffer[0];
}