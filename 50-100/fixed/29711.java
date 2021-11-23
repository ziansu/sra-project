private void isValid(int i, int j) {
    if ((i <= 0) || (i > (number))) {
        throw new java.lang.IndexOutOfBoundsException("");
    }
    if ((j <= 0) || (j > (number))) {
        throw new java.lang.IndexOutOfBoundsException("");
    }
}