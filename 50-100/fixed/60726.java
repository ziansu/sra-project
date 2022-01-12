private void updateEdgeList(java.awt.Rectangle rect) {
    java.util.ArrayList<rpggame.Edge> commonEdges = rpggame.Zone2.findCommonEdgesExceptCorners(rpggame.Zone2.getEdges(rect), this.edges);
    edges.addAll(rpggame.Zone2.getEdges(rect));
    removeCommonEdgePoints(commonEdges);
    fillNonbuildable(commonEdges, 1);
}