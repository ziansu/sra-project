@java.lang.Override
public void union(int p, int q) {
    int rootp = find(p);
    int rootq = find(q);
    if (rootp == rootq)
        return ;
    
    if ((sz[p]) > (sz[q])) {
        id[rootq] = rootp;
        sz[p] += sz[q];
    }else {
        id[rootp] = rootq;
        sz[q] += sz[p];
    }
    (count)--;
}