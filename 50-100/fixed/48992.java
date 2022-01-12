void quickDrawLastRow(java.awt.Graphics2D pG2) {
    worldToScreen(rotation, stretchX, stretchY);
    if ((currentInsertionRow) < 0) {
        return ;
    }
    drawPolygons(pG2, ((currentInsertionRow) + 1), ((currentInsertionRow) + 2), 1, (-1), dataYMax, (-1), (-1), 1, true);
}