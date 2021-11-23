public java.util.Set<de.fau.cs.mad.kwikshop.server.sorting.Edge> getEdges() {
    if ((edges) == null) {
        java.util.List<de.fau.cs.mad.kwikshop.server.sorting.Edge> edgeList = daoHelper.getEdgesBySupermarket(supermarket);
        if (edgeList != null)
            edges = new java.util.HashSet<de.fau.cs.mad.kwikshop.server.sorting.Edge>(edgeList);
        else
            edges = new java.util.HashSet<de.fau.cs.mad.kwikshop.server.sorting.Edge>();
        
    }
    return edges;
}