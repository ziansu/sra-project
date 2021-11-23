public void addEdge(Vertex src, Vertex dest, int weight) {
    Vertex s = null;
    Vertex d = null;
    if (vertices.contains(src)) {
        s = src;
    }
    if (vertices.contains(dest)) {
        d = dest;
    }
    Edge new_edge = new Edge(s, d, weight);
    s.neighbors.add(new_edge);
}