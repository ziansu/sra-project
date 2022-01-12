public void setupOverlay(int numberOfConnections) {
    java.lang.System.out.println(("setup overlay + " + numberOfConnections));
    java.util.List<java.lang.String> registeredHosts = java.util.Collections.list(cs455.overlay.node.Registry.registeredNodes.keys());
    cs455.overlay.graph.Graph graph = new cs455.overlay.graph.Graph(registeredHosts, numberOfConnections);
    graph.generateConnectedGraph();
    graph.randomlyAssignEdgeWeights();
}