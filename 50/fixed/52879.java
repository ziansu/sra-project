private void connect(int i, int j) {
    if ((siteStatus[i]) && (siteStatus[j]))
        unionFind.union(i, j);
    
}