private int next(int index) {
    index = (++index) & (mask);
    return index;
}