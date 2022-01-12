public void addEdge(int weight, T from, java.lang.Iterable<T> tos) {
    java.util.List<org.testng.internal.DynamicGraph.Edge<T>> edges = org.testng.collections.Lists.newArrayList();
    for (T to : tos) {
        edges.add(new org.testng.internal.DynamicGraph.Edge<>(from, to, weight));
    }
    addEdges(edges);
}