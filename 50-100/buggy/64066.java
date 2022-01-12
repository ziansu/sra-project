private void validate(int i, int j) {
    if ((((i < 0) || (i >= (n))) || (j < 0)) || (j >= (n))) {
        throw new java.lang.IllegalArgumentException();
    }
}