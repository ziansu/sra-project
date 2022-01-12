private void validate(int i, int j) {
    if ((((i < 1) || (i > (n))) || (j < 1)) || (j > (n))) {
        throw new java.lang.IllegalArgumentException();
    }
}