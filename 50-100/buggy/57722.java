@java.lang.Override
public void mouseReleased(java.awt.event.MouseEvent e) {
    cluedogame.GameOfCluedo game = frame.getGame();
    int row = cluedogame.GUI.CluedoFrame.convertYToRow(e.getY());
    int col = cluedogame.GUI.CluedoFrame.convertXToCol(e.getX());
    movePlayer(game, row, col);
}