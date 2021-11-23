private int getEdgeEncoding(int timeStep, int edgeIndex) {
    return ((vertexOffset) + ((timeStep + 1) * (edges.size()))) + edgeIndex;
}