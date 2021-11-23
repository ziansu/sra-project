public boolean isOpen(int i, int j) {
    if ((i <= 0) || (i > (n))) {
        throw new java.lang.IndexOutOfBoundsException("row index i out of bounds");
    }
    if ((j <= 0) || (j > (n))) {
        throw new java.lang.IndexOutOfBoundsException("column index j out of bounds");
    }
    return (grid[(i - 1)][(j - 1)]) == (open);
}