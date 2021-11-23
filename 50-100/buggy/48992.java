void quickDrawLastRow(java.awt.Graphics2D pG2) {
    worldToScreen(rotation, stretchX, stretchY);
    int lengthPos = (currentInsertionRow) - 1;
    if (lengthPos < 0) {
        return ;
    }
    drawPolygons(pG2, (lengthPos + 1), (lengthPos + 2), 1, (-1), dataYMax, (-1), (-1), 1, true);
}