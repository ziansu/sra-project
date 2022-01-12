public static void main(java.lang.String[] args) {
    src.Network virtualNet = new src.Network();
    src.Main.setRandomCosts(virtualNet);
    src.UGraph graph = new src.UGraph(virtualNet, new src.UGraph.Vertex(src.Main.DEST_NODE));
    graph.dijkstra(src.Main.SOURCE_NODE);
    graph.makeLabels();
    src.Main.printResults(graph);
}