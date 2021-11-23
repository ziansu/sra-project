private org.graphast.model.contraction.CHEdge getEdge(long fromNodeId, long toNodeId, int distance, boolean expandingDirection) {
    if (expandingDirection == true) {
        return getEdgeForwards(fromNodeId, toNodeId, distance);
    }else {
        return getEdgeBackwards(fromNodeId, toNodeId, distance);
    }
}