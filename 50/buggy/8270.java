private void removeEdge(rgraph.Edge e) {
    e.removeFromNodes();
    edges.remove(e);
}