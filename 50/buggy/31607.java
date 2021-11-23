private void validateInput(int x) {
    if (!((0 < x) && (x <= (n)))) {
        throw new java.lang.IllegalArgumentException();
    }
}