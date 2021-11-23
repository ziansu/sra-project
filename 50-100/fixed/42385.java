public org.freejava.dependency.graph.Graph<T> transform(org.freejava.dependency.graph.Graph<T> graph) {
    java.util.Set<org.freejava.dependency.graph.Edge<T>> edges = new java.util.HashSet<org.freejava.dependency.graph.Edge<T>>();
    for (org.freejava.dependency.graph.Edge<T> edge : graph.getEdges()) {
        if (!(edge.getFrom().equals(edge.getTo()))) {
            edges.add(edge);
        }
    }
    org.freejava.dependency.graph.Graph<T> result = new org.freejava.dependency.graph.Graph<T>(edges);
    return result;
}