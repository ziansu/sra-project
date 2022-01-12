public java.util.Map<java.lang.String, algorithm.Node> getGraphAtTime(int t) {
    if (t > (graphLookAhead)) {
        for (int i = (graphLookAhead) + 1; i <= t; i++) {
            java.util.Map<java.lang.String, algorithm.Node> graph = genGraph();
            plan.add(graph);
        }
        graphLookAhead = t;
    }
    return plan.get(t);
}