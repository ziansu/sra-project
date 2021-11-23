private void checkIndex(int index) {
    if ((0 <= index) && (index < (size))) {
        return ;
    }
    throw new java.lang.IndexOutOfBoundsException();
}