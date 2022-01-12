public boolean isFull(int i, int j) {
    if (isOpen(i, j)) {
        i -= i;
        j -= j;
        int site = (i * (gridBounds)) + j;
        return uf.connected(virtualTopSite, site);
    }
    return false;
}