public java.util.List<ca.ubc.ece.cpen221.mp3.staff.Vertex> getUpstreamNeighbors(ca.ubc.ece.cpen221.mp3.staff.Vertex v) {
    java.util.LinkedList<ca.ubc.ece.cpen221.mp3.staff.Vertex> upstreamNeighboursList = new java.util.LinkedList<ca.ubc.ece.cpen221.mp3.staff.Vertex>();
    for (java.util.List<java.lang.String> vertices : adjacencyList) {
        for (java.lang.String vertex : vertices) {
            if ((v.getLabel()) == vertex) {
                upstreamNeighboursList.add(new ca.ubc.ece.cpen221.mp3.staff.Vertex(vertexList.get(adjacencyList.indexOf(vertices))));
            }
        }
    }
    return upstreamNeighboursList;
}