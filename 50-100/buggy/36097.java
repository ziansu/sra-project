public void union(int p, int q) {
    int pid = find(p);
    int qid = find(q);
    if ((size[p]) > (size[q])) {
        id[qid] = pid;
        (size[pid])++;
    }else {
        id[pid] = qid;
        (size[qid])++;
    }
}