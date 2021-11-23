@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent arg0) {
    this.setBackground(onClickColor);
    this.board.pressed(this);
}