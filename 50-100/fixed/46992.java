@java.lang.Override
public boolean redoAction() {
    for (int col = 0; col < 12; col++) {
        for (int row = 0; row < 12; row++) {
            boardTiles.get(row).get(col).setExists(end[row][col]);
        }
    }
    redrawBoard();
    return true;
}