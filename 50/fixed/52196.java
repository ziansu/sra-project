java.lang.String next() throws java.io.IOException {
    final java.lang.String ret = cur;
    getNext();
    return ret;
}