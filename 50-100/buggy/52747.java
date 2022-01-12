private void scanTriangle(rend.Vertex vert1, rend.Vertex vert2, rend.Vertex vert3, boolean side) {
    rend.Gradient grad = new rend.Gradient(vert1, vert2, vert3);
    rend.Edge topToBot = new rend.Edge(vert1, vert3, grad, 0);
    rend.Edge topToMid = new rend.Edge(vert1, vert2, grad, 0);
    rend.Edge midToBot = new rend.Edge(vert2, vert3, grad, 1);
    scanEdges(topToBot, topToMid, side);
    scanEdges(topToBot, midToBot, side);
}