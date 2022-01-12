private int computeLookahead(gnu.trove.list.array.TIntArrayList neighbors, de.rwth.i2.attestor.graph.morphism.VF2GraphData data) {
    int lookaheadIn = 0;
    for (int i = 0; i < (neighbors.size()); i++) {
        int next = neighbors.get(i);
        if (data.containsIngoing(next)) {
            ++lookaheadIn;
        }
    }
    return lookaheadIn;
}