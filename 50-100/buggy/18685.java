@java.lang.Override
public java.lang.Integer read(java.io.InputStream in) throws java.io.IOException {
    int value = 0;
    value = (value << 8) | (in.read());
    value = (value << 8) | (in.read());
    value = (value << 8) | (in.read());
    value = (value << 8) | (in.read());
    return value;
}