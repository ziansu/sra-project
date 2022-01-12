public graph.Edge buildEdge(java.lang.String dataContent, graph.Graph graph) {
    java.util.Scanner dataScan = new java.util.Scanner(dataContent);
    dataScan.useDelimiter(" ");
    int originVertexIndex = dataScan.nextInt();
    int destinyVertexIndex = dataScan.nextInt();
    graph.Vertex originVertex = graph.getVertex(originVertexIndex);
    graph.Vertex destinyVertex = graph.getVertex(destinyVertexIndex);
    graph.Edge e = new graph.Edge(originVertex, destinyVertex);
    dataScan.close();
    return e;
}