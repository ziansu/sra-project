@java.lang.Override
public java.util.Set<E> getAllEdges(V sourceVertex, V targetVertex) {
    java.util.Set<E> baseEdges = super.getAllEdges(sourceVertex, targetVertex);
    if (jointAccess)
        baseEdges.addAll(primaryGraph.getAllEdges(sourceVertex, targetVertex));
    
    return baseEdges;
}