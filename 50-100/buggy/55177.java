private boolean siteCanPercolate(int i, int j) {
    if (isOpen(i, j)) {
        i -= i;
        j -= j;
        int site = (i * (gridBounds)) + j;
        return uf.connected(virtualBottomSite, site);
    }
    return false;
}