private void union(int from, int to) {
    if ((siteStatus[to]) == (Percolation.BLOCKED)) {
        return ;
    }
    if (((siteStatus[from]) == (Percolation.FULL_OPEN)) || ((siteStatus[to]) == (Percolation.FULL_OPEN))) {
        siteStatus[from] = Percolation.FULL_OPEN;
        siteStatus[to] = Percolation.FULL_OPEN;
    }
    sitesUnionFind.union(from, to);
}