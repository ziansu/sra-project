private static void addEdge(Analyzer.ui.GraphModel graphModel, Analyzer.ui.Node n1, Analyzer.ui.Node n2) {
    Analyzer.ui.DirectedGraph directedGraph = graphModel.getDirectedGraph();
    Analyzer.ui.Edge e1 = directedGraph.getEdge(n1, n2);
    if (e1 == null) {
        e1 = graphModel.factory().newEdge(n1, n2, 0, 1.0, true);
        directedGraph.addEdge(e1);
    }else {
        double weight = e1.getWeight();
        e1.setWeight((weight + 1));
    }
}