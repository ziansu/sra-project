protected void ensureValidIndex(int index) {
    if ((index < 0) || (index >= (size()))) {
        throw new java.lang.IndexOutOfBoundsException();
    }
}