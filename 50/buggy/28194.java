public int nextInteger_Close() {
    next();
    int value = getInteger(1);
    close();
    return value;
}