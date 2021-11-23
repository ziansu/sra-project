public int getEdgeWeight(cs455.overlay.dijkstra.Vertex source, cs455.overlay.dijkstra.Vertex step) {
    for (cs455.overlay.dijkstra.Edge edge : edges) {
        if (((edge.getSource().equals(source)) && (edge.getDestination().equals(step))) || ((edge.getSource().equals(step)) && (edge.getDestination().equals(source)))) {
            return edge.getWeight();
        }
    }
    return -1;
}