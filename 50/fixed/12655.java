private java.lang.Object readNull() throws java.io.IOException {
    read();
    readRequiredChar('u');
    readRequiredChar('l');
    readRequiredChar('l');
    return null;
}