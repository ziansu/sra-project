@java.lang.Override
public java.util.Set<E> getAllEdges(V sourceVertex, V targetVertex) {
    java.util.Set<E> baseEdges = new java.util.HashSet<E>(primaryGraph.getAllEdges(sourceVertex, targetVertex));
    if (jointAccess)
        baseEdges.addAll(super.getAllEdges(sourceVertex, targetVertex));
    
    return baseEdges;
}