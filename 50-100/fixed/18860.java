private int getNextV(int v) {
    java.util.Iterator<java.lang.Integer> adj_v_itr = g.adj(v).iterator();
    while ((!(adj_v_itr.hasNext())) && (v < (V))) {
        v = v + 1;
        if (v < (V))
            adj_v_itr = g.adj(v).iterator();
        
    } 
    return v;
}