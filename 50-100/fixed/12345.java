public static assignment3_DS.graph.Graph loadGraph(java.io.File nodeFile, java.io.File arcFile) {
    java.lang.System.out.println(((("loading nodes/ars from " + nodeFile) + " / ") + arcFile));
    java.util.Map<java.lang.Integer, assignment3_DS.graph.Node> nodes = assignment3_DS.graph.CSVLoader.getNodes(nodeFile);
    java.util.List<assignment3_DS.graph.Arc> arcs = assignment3_DS.graph.CSVLoader.getArcs(arcFile, nodes);
    if (arcs == null)
        return null;
    else
        return new assignment3_DS.graph.Graph(nodes, arcs);
    
}