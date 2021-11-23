@java.lang.Override
public boolean undoAction() {
    for (int col = 0; col < 12; col++) {
        for (int row = 0; row < 12; row++) {
            boardTiles[col][row].setExists(start[col][row]);
        }
    }
    colsTextField.setText(java.lang.Integer.toString(startCols));
    rowsTextField.setText(java.lang.Integer.toString(startRows));
    redrawBoard();
    return true;
}