private void clearBoard() {
    for (int i = 0; i < (cellArrayStatus.length); i++) {
        for (int r = 0; r < (cellArrayStatus[i].length); r++) {
            cellArrayStatus[i][r] = false;
        }
    }
    evolving = false;
    stage = 0;
    lblStageNr.setText(java.lang.String.valueOf(stage));
    updateBoard();
}