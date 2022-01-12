public boolean rollUp() {
    if ((row) <= 1) {
        return false;
    }
    setRow(((row) - 1));
    return true;
}