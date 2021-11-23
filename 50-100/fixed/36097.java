public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if ((size[pid]) > (size[qid])) {
        id[qid] = pid;
        size[pid] += size[qid];
    }else {
        id[pid] = qid;
        size[qid] += size[pid];
    }
}