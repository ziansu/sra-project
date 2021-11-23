public controller.AbstractEdgeView addEdgeView(controller.AbstractEdgeView edgeView) {
    if (edgeView != null) {
        aDrawPane.getChildren().add(edgeView);
        graph.addEdge(edgeView.getRefEdge());
        allEdgeViews.add(edgeView);
    }
    return edgeView;
}