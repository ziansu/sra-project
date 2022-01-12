private void union(int from, int to) {
    switch (siteStatus[to]) {
        case Percolation.BLOCKED :
            break;
        case Percolation.EMPTY_OPEN :
        case Percolation.FULL_OPEN :
            sitesUnionFind.union(from, to);
            siteStatus[from] = siteStatus[to];
            break;
    }
}