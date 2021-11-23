public static void main(java.lang.String[] args) {
    src.Network virtualNet = new src.Network();
    src.Main.setRandomCosts(virtualNet);
    src.UGraph graph = new src.UGraph(virtualNet);
    graph.dijkstra(src.Main.SOURCE_NODE);
    graph.makeLabels();
    src.Main.printResults(graph);
}