private void connect(int i, int j) {
    try {
        if ((siteStatus[i]) && (siteStatus[j]))
            unionFind.union(i, j);
        
    } catch (java.lang.Exception e) {
    }
}