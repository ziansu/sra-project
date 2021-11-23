public void createEdgeBetween(net.tullco.tullutils.graphutils.Vertex origin, net.tullco.tullutils.graphutils.Vertex destination, int distance) {
    net.tullco.tullutils.graphutils.Edge e = new net.tullco.tullutils.graphutils.Edge(origin, destination, distance);
    this.addEdge(e);
}