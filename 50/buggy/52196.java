java.lang.String next() throws java.io.IOException {
    final java.lang.String ret = cur;
    if (hasNext()) {
        getNext();
    }else {
        cur = null;
    }
    return ret;
}