private org.jgrapht.alg.Neighbors<V> getSuccessors(V v) {
    org.jgrapht.alg.Neighbors<V> neighbors = successorMap.get(v);
    if (neighbors == null) {
        neighbors = new org.jgrapht.alg.Neighbors(org.jgrapht.alg.Graphs.successorListOf(graph, v));
        successorMap.put(v, neighbors);
    }
    return neighbors;
}