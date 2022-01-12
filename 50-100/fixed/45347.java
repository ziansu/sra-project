@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent me) {
    java.awt.Point cursorLocation = me.getPoint();
    for (java.awt.Point site : this.gameState.getDiagram().getSites()) {
        voronoigame.model.Cell cell = this.gameState.getCell(site);
        if ((voronoigame.Util.isInCircle(cursorLocation, site, Cell.NUCLEUS_RADIUS)) && (cell instanceof voronoigame.model.MoveableCell)) {
            this.setFocus(cell, FocusType.HOVER);
            return ;
        }
    }
    this.clearFocus();
}