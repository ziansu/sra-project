private int getNextV(int v) {
    java.lang.Iterable<java.lang.Integer> adj_v_itr = g.adj(v);
    while ((!(adj_v_itr.hasNext())) && (v < (V))) {
        v = v + 1;
    } 
    return v;
}