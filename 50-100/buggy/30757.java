protected void addEdge(org.gephi.graph.impl.EdgeImpl edge) {
    if ((views.length) > 0) {
        for (org.gephi.graph.impl.GraphViewImpl view : views) {
            view.ensureEdgeVectorSize(edge);
            if ((view.nodeView) && (!(view.edgeView))) {
                view.addEdgeInNodeView(edge);
            }
        }
    }
}