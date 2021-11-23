protected void removeEdge(org.gephi.graph.impl.EdgeImpl edge) {
    if ((views.length) > 0) {
        for (org.gephi.graph.impl.GraphViewImpl view : views) {
            if (view != null) {
                view.removeEdge(edge);
            }
        }
    }
}