public controller.AbstractEdgeView addEdgeView(controller.AbstractEdgeView edgeView) {
    if (edgeView != null) {
        aDrawPane.getChildren().add(edgeView);
        allEdgeViews.add(edgeView);
    }
    return edgeView;
}