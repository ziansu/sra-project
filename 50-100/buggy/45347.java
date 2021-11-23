@java.lang.Override
public void mouseMoved(java.awt.event.MouseEvent me) {
    for (java.awt.Point site : this.gameState.getDiagram().getSites()) {
        java.awt.Point cursorLocation = me.getPoint();
        voronoigame.model.Cell cell = this.gameState.getCell(site);
        if ((voronoigame.Util.isInCircle(cursorLocation, site, Cell.NUCLEUS_RADIUS)) && (cell instanceof voronoigame.model.MoveableCell)) {
            this.cursorState.setFocus(cell, FocusType.HOVER);
            return ;
        }
    }
    this.cursorState.clearFocus();
}