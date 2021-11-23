public void draw(java.awt.Graphics g, boolean showEdges, boolean showDelaunay, boolean showSites, boolean showData) {
    this.g = g;
    g2 = ((java.awt.Graphics2D) (g));
    g2.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
    checkMovement();
    drawVoronoiArea();
    drawBounding();
    drawVoronoiCluster();
    drawClusterNodes(showSites, showData);
    drawDelaunay(showDelaunay);
    drawLabels();
    drawEdges(showEdges);
    drawTestEdge();
    drawNodes();
    drawCircleTest();
    drawRadiusTest();
}