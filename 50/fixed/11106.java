@java.lang.Override
public void write(byte[] buffer) throws java.io.IOException {
    out.write(buffer, 0, buffer.length);
    size += buffer.length;
}