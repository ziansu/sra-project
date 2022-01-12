public java.util.Set<de.fau.cs.mad.kwikshop.server.sorting.Edge> getEdges() {
    if ((edges) == null) {
        java.util.List<de.fau.cs.mad.kwikshop.server.sorting.Edge> edgeList = daoHelper.getEdgesBySupermarket(supermarket);
        if (edgeList != null)
            edges = new java.util.HashSet(edgeList);
        else
            edges = new java.util.HashSet<>();
        
    }
    return edges;
}