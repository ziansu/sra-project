public java.util.List<ca.ubc.ece.cpen221.mp3.staff.Vertex> getUpstreamNeighbors(ca.ubc.ece.cpen221.mp3.staff.Vertex vertex) {
    java.util.List<ca.ubc.ece.cpen221.mp3.staff.Vertex> upstreamNeighboursList = new java.util.LinkedList<ca.ubc.ece.cpen221.mp3.staff.Vertex>();
    for (int i = 0; i < (vertexList.size()); i++) {
        if (adjacencyList.contains(vertex)) {
            upstreamNeighboursList.add(new ca.ubc.ece.cpen221.mp3.staff.Vertex(vertexList.get(i)));
        }
    }
    return upstreamNeighboursList;
}