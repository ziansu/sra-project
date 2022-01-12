public void addVertex(java.lang.Object vertex) {
    if ((vertex == null) || (vertexTable.contains(vertex)))
        return ;
    
    com.xqbase.java.list.DList<com.xqbase.java.graph.WUGraph.Edge> edgeDList = new com.xqbase.java.list.DList<com.xqbase.java.graph.WUGraph.Edge>();
    com.xqbase.java.graph.WUGraph.Vertex v = new com.xqbase.java.graph.WUGraph.Vertex(vertex, edgeDList);
    vertexTable.insert(vertex, v);
    vertexList.insertFront(v);
    adjacencyList.insertFront(edgeDList);
    (vertexCount)++;
}