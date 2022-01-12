public void checkIndexBounds(int i, int j) {
    if ((((i < 0) || (j < 0)) || (i > (size))) || (j > (size))) {
        throw new java.lang.IndexOutOfBoundsException("Illegal parameter value.");
    }
}