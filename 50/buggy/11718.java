@java.lang.Override
public void write(byte[] b) throws java.io.IOException {
    grab(b.length);
    super.write(b);
}