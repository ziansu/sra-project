@java.lang.Override
public int outDegreeOf(V vertex) {
    int degree = super.outDegreeOf(vertex);
    if (primaryGraph.containsVertex(vertex))
        degree += primaryGraph.outDegreeOf(vertex);
    
    return degree;
}