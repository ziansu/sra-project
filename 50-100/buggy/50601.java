public void registerLike(long uId) {
    graph.addVertex(uId);
    java.util.Set<java.lang.Long> verticesList = graph.getVerticesList();
    for (long vertex : verticesList) {
        if (friendshipGraph.hasEdge(uId, vertex)) {
            graph.addEdge(uId, vertex);
            dirty = true;
        }
    }
}