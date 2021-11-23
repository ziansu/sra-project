public void union(int v, int w) {
    int rv = root(v);
    int rw = root(w);
    if (rv == rw) {
        return ;
    }
    int sv = size[rv];
    int sw = size[rw];
    if (sv > sw) {
        id[rw] = rv;
        size[rv] = sv + sw;
    }else {
        id[rv] = rw;
        size[rw] = sv + sw;
    }
}