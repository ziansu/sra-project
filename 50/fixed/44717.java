public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if (pid != qid) {
        id[pid] = qid;
        --(count);
    }
}