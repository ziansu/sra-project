@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((chessManMover) == null) {
        if ((table[((e.getY()) / 70)][((e.getX()) / 70)]) != null)
            this.showAvailableMoves(e);
        
    }else {
        this.chessManMove(e);
    }
}