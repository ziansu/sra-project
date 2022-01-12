public java.util.LinkedList<diag.stn.STN.Vertex> adjacentNodes(diag.stn.STN.Vertex last) {
    java.util.LinkedHashSet<diag.stn.STN.DEdge> edges = map.get(last);
    if (edges == null)
        return null;
    
    java.util.LinkedList<diag.stn.STN.Vertex> adjacent = new java.util.LinkedList<>();
    for (diag.stn.STN.DEdge edg : edges) {
        adjacent.add(edg.getEnd());
    }
    return adjacent;
}