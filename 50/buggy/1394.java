@java.lang.Override
public java.util.List<java.lang.String> getNeighbours(java.lang.String vertex) {
    if (!(hasVertex(vertex)))
        return null;
    
    return v.get(vertex);
}