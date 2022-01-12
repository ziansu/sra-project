@java.lang.Override
public boolean accept(com.graphhopper.util.EdgeIteratorState edgeIterState) {
    int adj = edgeIterState.getAdjNode();
    if ((((baseNode) >= (maxNodes)) || (adj >= (maxNodes))) || ((baseNodeLevel) <= (graph.getLevel(adj))))
        return edgeIterState.isBackward(encoder);
    else
        return false;
    
}