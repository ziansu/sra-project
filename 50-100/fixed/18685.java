@java.lang.Override
public java.lang.Long read(java.io.InputStream in) throws java.io.IOException {
    long value = 0;
    for (int i = 0; i < 8; i++) {
        value = (value << 8) | (in.read());
    }
    return value;
}