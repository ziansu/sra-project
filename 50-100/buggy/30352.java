public static <V, E> int diameter(org.jgrapht.graph.SimpleGraph<V, E> g) {
    org.jgrapht.GraphPath<V, E> diamPath = no.uib.ii.algo.st8.algorithms.DiameterInspector.diameterPath(g);
    if (diamPath == null)
        return -1;
    
    return (diamPath.getEdgeList().size()) + 1;
}