public static boolean graphContainsEdge(edu.uci.ics.jung.graph.DirectedGraph<java.lang.Integer, main.jung.MyEdge> graph, main.jung.MyEdge edge) {
    if ((graph == null) || (edge == null))
        return false;
    
    java.util.Collection<main.jung.MyEdge> graphEdges = graph.getEdges();
    for (main.jung.MyEdge curEdge : graphEdges) {
        if (edge.isIdentical(curEdge))
            return true;
        
    }
    return false;
}