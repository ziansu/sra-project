private void addComponents(ru.ifmo.ctddev.gmwcs.solver.Graph graph, ru.ifmo.ctddev.gmwcs.solver.Node root, java.util.PriorityQueue<java.util.Set<ru.ifmo.ctddev.gmwcs.solver.Node>> components) {
    ru.ifmo.ctddev.gmwcs.solver.Graph copy = graph.subgraph(graph.vertexSet());
    graph = copy;
    graph.removeVertex(root);
    components.addAll(graph.connectedSets());
}