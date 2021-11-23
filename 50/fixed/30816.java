public int inDegree(diag.stn.STN.Vertex to) {
    java.util.LinkedHashSet<diag.stn.STN.DEdge> edges = reverseMap.get(to);
    if (edges == null)
        return 0;
    
    return edges.size();
}