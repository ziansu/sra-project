private void setupOverlay(int connectionsRequired) {
    java.util.ArrayList<cs455.overlay.dijkstra.Vertex> vertices = new java.util.ArrayList<cs455.overlay.dijkstra.Vertex>();
    for (java.lang.String node : messageNodeConnections.keySet()) {
        vertices.add(new cs455.overlay.dijkstra.Vertex(node, connectionsRequired));
    }
    cs455.overlay.dijkstra.Graph graph = new cs455.overlay.dijkstra.Graph(vertices);
    graph.setupOverlay(connectionsRequired);
}