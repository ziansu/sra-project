@java.lang.Override
public void write(int b) throws java.io.IOException {
    grab(1);
    super.write(b);
}