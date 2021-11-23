private void ancestors(edu.princeton.cs.algs4.SET<java.lang.Integer> ancestors, int w) {
    if (ancestors.contains(w))
        return ;
    
    java.lang.Iterable<java.lang.Integer> adjs = source.adj(w);
    for (int v : adjs) {
        ancestors.add(v);
        ancestors(ancestors, v);
    }
}