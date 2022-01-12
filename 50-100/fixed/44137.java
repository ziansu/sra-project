public void addEdge(Vertex src, Vertex dest, int weight) {
    Vertex s = null;
    Vertex d = null;
    s = src;
    d = dest;
    Edge new_edge = new Edge(s, d, weight);
    s.neighbors.add(new_edge);
}