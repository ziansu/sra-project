private void drawAxis(java.awt.Graphics2D graph, int biWidth, int biHeight) {
    graph.setStroke(axisStroke);
    graph.setColor(axisColor);
    graph.draw(new java.awt.geom.Line2D.Double((biWidth / 2), 0, (biWidth / 2), biHeight));
    graph.draw(new java.awt.geom.Line2D.Double(0, (biHeight / 2), biWidth, (biHeight / 2)));
}