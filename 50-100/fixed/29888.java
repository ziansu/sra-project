private int readChar() throws java.io.IOException {
    int c = reader.read();
    if (((lastc) == '\n') || (((lastc) == '\r') && (c != '\n'))) {
        pos = 1;
        offset = 0;
        (line)++;
    }else {
        (pos)++;
    }
    lastc = c;
    return c;
}