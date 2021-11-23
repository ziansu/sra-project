public static edu.cmu.tetrad.graph.Graph randomGraphRandomForwardEdges(int numNodes, int numLatentConfounders, int numEdges, int maxDegree, int maxIndegree, int maxOutdegree, boolean connected) {
    java.util.List<edu.cmu.tetrad.graph.Node> nodes = new java.util.ArrayList<>();
    for (int i = 0; i < numNodes; i++) {
        nodes.add(new edu.cmu.tetrad.graph.GraphNode(("X" + (i + 1))));
    }
    return edu.cmu.tetrad.graph.GraphUtils.randomGraph(nodes, numLatentConfounders, numEdges, maxDegree, maxIndegree, maxOutdegree, connected);
}