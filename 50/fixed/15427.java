@java.lang.Override
public void write(java.lang.String str, int off, int len) throws java.io.IOException {
    super.write(str.toUpperCase(), off, len);
}