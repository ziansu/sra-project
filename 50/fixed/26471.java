@java.lang.Override
public void write(int b) throws java.io.IOException {
    grab(1);
    out.write(b);
}