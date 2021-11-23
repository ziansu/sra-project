private void isValid(int i, int j) {
    if ((i <= 0) || (i > (count))) {
        throw new java.lang.IndexOutOfBoundsException("");
    }
    if ((j <= 0) || (j > (count))) {
        throw new java.lang.IndexOutOfBoundsException("");
    }
}