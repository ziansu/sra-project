@java.lang.Override
public int read() throws java.io.IOException {
    if ((current) == null) {
        return -1;
    }
    int result = current.read();
    if (result != (-1)) {
        return result;
    }
    advance();
    return read();
}