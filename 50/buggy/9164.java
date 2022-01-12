public boolean isOpen(int row, int col) {
    if (validSite(row, col)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return open[site(row, col)];
}