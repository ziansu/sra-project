public boolean insertPiece(int player, int column) {
    for (int i = (gameGrid.length) - 1; i >= 0; i--) {
        if (canPlace(i, column)) {
            gameGrid[i][column] = player;
            break;
        }
    }
    return checkWin();
}