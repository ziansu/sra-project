private int readChar() throws java.io.IOException {
    int c = reader.read();
    if ((c == '\r') || ((c == '\n') && ((lastc) != '\r'))) {
        pos = 1;
        (line)++;
    }else {
        (pos)++;
    }
    lastc = c;
    return c;
}