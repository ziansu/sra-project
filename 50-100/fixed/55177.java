private boolean siteCanPercolate(int i, int j) {
    if (isOpen(i, j)) {
        i -= 1;
        j -= 1;
        int site = (i * (gridBounds)) + j;
        return uf.connected(virtualBottomSite, site);
    }
    return false;
}