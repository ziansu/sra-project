public void drawDebugBoundingBoxes(java.awt.Graphics g) {
    if ((npcToThieve.valid()) && (npcToThieve.inViewport())) {
        npcToThieve.bounds(npcBounds[0], npcBounds[1], npcBounds[2], npcBounds[3], npcBounds[4], npcBounds[5]);
        for (java.awt.Polygon poly : npcToThieve.triangles()) {
            g.drawPolygon(poly);
        }
    }
}