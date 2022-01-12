@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    cluedogame.GameOfCluedo game = frame.getGame();
    int row = frame.convertYToRow(e.getY());
    int col = frame.convertXToCol(e.getX());
    movePlayer(game, row, col);
}