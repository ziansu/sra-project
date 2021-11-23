public boolean isFull(int row, int col) {
    if (validSite(row, col)) {
        throw new java.lang.IndexOutOfBoundsException();
    }
    return (this.isOpen(row, col)) && (this.openPathToTop(row, col));
}