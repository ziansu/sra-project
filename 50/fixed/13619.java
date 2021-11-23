@java.lang.Override
public int read() throws java.io.IOException {
    byte[] buffer = new byte[1];
    int length = stream.read(buffer);
    return length == 1 ? buffer[0] : -1;
}