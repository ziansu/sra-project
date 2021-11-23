public int size() {
    int size = (last) - (first);
    if (size < 0)
        return size + (stored.length);
    else {
        return size;
    }
}