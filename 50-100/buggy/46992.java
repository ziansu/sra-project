@java.lang.Override
public boolean redoAction() {
    for (int col = 0; col < 12; col++) {
        for (int row = 0; row < 12; row++) {
            boardTiles[col][row].setExists(end[col][row]);
        }
    }
    redrawBoard();
    return true;
}