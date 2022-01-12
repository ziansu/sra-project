@java.lang.Override
public void mouseClicked(java.awt.event.MouseEvent e) {
    java.lang.System.out.println(((("Mouse Click: x:" + (position.getX())) + " y:") + (position.getY())));
    if ((piece) != null)
        java.lang.System.out.println(piece.printValidPositions());
    
    board.checkMoveable(this, this.getPiece());
}