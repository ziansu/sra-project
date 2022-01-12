public void drawArtPoints(java.awt.Graphics g) {
    g.setColor(java.awt.Color.red);
    if (displayArticulationPoints) {
        for (Node node : artPoints.articulationPoints) {
            Location nodeLocation = node.getLoc();
            java.awt.Point point = nodeLocation.asPoint(origin, scale);
            g.drawOval(((int) (point.getX())), ((int) (point.getY())), 2, 2);
        }
    }
}