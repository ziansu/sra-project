protected void removeEdge(org.gephi.graph.impl.EdgeImpl edge) {
    if ((views.length) > 0) {
        for (org.gephi.graph.impl.GraphViewImpl view : views) {
            view.removeEdge(edge);
        }
    }
}