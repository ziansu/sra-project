private V getVertex(java.lang.String id, java.util.Map<java.lang.String, V> vertexes, org.jgrapht.Graph<V, E> graph) {
    V v = vertexes.get(id);
    if (v == null) {
        v = vertexProvider.buildVertex(id, new java.util.HashMap<>());
        graph.addVertex(v);
        vertexes.put(id, v);
    }
    return v;
}