private int wrapX(int x) {
    return ((x % (width)) + (width)) % (width);
}