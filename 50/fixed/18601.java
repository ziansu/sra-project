@java.lang.Override
public boolean removeEdge(java.lang.String vertexA, java.lang.String vertexB) {
    if ((hasVertex(vertexA)) && (hasVertex(vertexB))) {
        return v.get(vertexA).remove(vertexB);
    }
    return false;
}