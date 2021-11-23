public void addVertex(ca.ubc.ece.cpen221.mp3.staff.Vertex v) {
    if (!(vertexList.contains(v))) {
        adjacencyList.add(new java.util.HashSet<java.lang.String>());
        vertexList.add(v.getLabel());
    }
}