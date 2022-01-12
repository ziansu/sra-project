@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    if ((this.um) == null) {
        throw new java.lang.RuntimeException("MakeUserMoveController.um was null when mouseReleased was called");
    }
    if (um.isValid()) {
        um.pushMove(l);
        l.getBoard().settleTiles();
    }
    um.finishMove(l);
    if (l.isFinished()) {
        lv.endLevel();
        return ;
    }
    lv.repaint();
    this.um = null;
}