public void union(int p, int q) {
    int rootP = root(p);
    int rootQ = root(q);
    mId[rootP] = rootQ;
}