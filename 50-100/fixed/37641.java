private rocnikovyprojekt.FSA.Delta reverseDelta() {
    rocnikovyprojekt.FSA.Delta D = new rocnikovyprojekt.FSA.Delta();
    for (java.lang.Object p : states) {
        for (java.lang.Object a : symbolsAndEpsilon) {
            java.util.Set<java.lang.Object> val = delta.get(p, a);
            for (java.lang.Object q : val) {
                java.util.Set<java.lang.Object> v = D.get(q, a);
                v.add(p);
                D.put(q, a, v);
            }
        }
    }
    return D;
}