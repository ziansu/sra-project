public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if (pid != qid) {
        if ((sz[pid]) <= (sz[qid])) {
            id[pid] = qid;
            sz[qid] += sz[pid];
        }else {
            id[qid] = pid;
            sz[pid] += sz[qid];
        }
        --(count);
    }
}