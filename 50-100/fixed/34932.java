private V getVertex(java.lang.String id) {
    V v = vertexes.get(id);
    if (v == null) {
        v = vertexProvider.buildVertex(id, new java.util.HashMap<>());
        graph.addVertex(v);
        vertexes.put(id, v);
    }
    return v;
}