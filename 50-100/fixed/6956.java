public boolean addEdge(boolean isAnySymbol, java.lang.String transition, int sourceVertex, int sinkVertex) {
    if ((sourceVertex < (graphStructure.size())) && (sinkVertex < (graphStructure.size()))) {
        graphStructure.get(sourceVertex).getValue().add(new com.sonechka.graph.Edge(isAnySymbol, transition, sourceVertex, sinkVertex));
        return true;
    }
    return false;
}