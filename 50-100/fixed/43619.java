public void connectVertices(java.lang.String vertexLabel1, java.lang.String vertexLabel2) throws java.lang.RuntimeException {
    if (!(vertexList.containsKey(vertexLabel1))) {
        throw new java.lang.RuntimeException("Cannot connect vertices! Vertex in first argument does not exist in the graph!");
    }else
        if (!(vertexList.containsKey(vertexLabel2))) {
            throw new java.lang.RuntimeException("Cannot connect vertices! Vertex in second argument does not exist in the graph!");
        }
    
    connectVertices(vertexList.get(vertexLabel1), vertexList.get(vertexLabel2));
}