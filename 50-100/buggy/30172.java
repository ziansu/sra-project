public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if (pid != qid) {
        if ((sz[pid]) <= (sz[qid])) {
            id[p] = qid;
            sz[q] += sz[p];
        }else {
            id[q] = pid;
            sz[p] += sz[q];
        }
        --(count);
    }
}