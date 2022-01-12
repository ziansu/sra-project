@java.lang.Override
public void union(int p, int q) {
    int rootp = find(p);
    int rootq = find(q);
    if (rootp == rootq)
        return ;
    
    if ((sz[rootp]) >= (sz[rootq])) {
        id[rootq] = rootp;
        sz[rootp] += sz[rootq];
    }else {
        id[rootp] = rootq;
        sz[rootq] += sz[rootp];
    }
    (count)--;
}