public java.lang.String next() {
    if (hasNext()) {
        return sa.get(((count)++));
    }else {
        throw new java.util.NoSuchElementException();
    }
}