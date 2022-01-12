public void union(int p, int q) {
    int root_p = find(p);
    int root_q = find(q);
    if ((rank[root_p]) > (rank[root_q])) {
        set[root_q] = root_q;
    }else {
        set[root_p] = root_q;
        if ((rank[root_p]) == (rank[root_q])) {
            (rank[root_q])++;
        }
    }
}