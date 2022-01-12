@java.lang.Override
public spade.core.Graph getChildren(java.lang.String parentVertexHash) {
    spade.core.Graph result = new spade.core.Graph();
    for (java.util.Map.Entry<java.lang.String, spade.core.AbstractEdge> entry : edgeIdentifiers.entrySet()) {
        spade.core.AbstractEdge edge = entry.getValue();
        spade.core.AbstractVertex parentVertex = edge.getParentVertex();
        if (parentVertex.bigHashCode().equals(parentVertexHash)) {
            result.putVertex(edge.getChildVertex());
            result.putEdge(edge);
        }
    }
    return result;
}