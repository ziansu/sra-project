private void updateGraph(java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> graph, int start, int end) {
    if (!(graph.containsKey(start))) {
        graph.put(start, new java.util.HashSet<>());
    }
    graph.get(start).add(end);
}