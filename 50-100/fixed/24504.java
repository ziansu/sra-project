private boolean isWon() {
    boolean win = true;
    for (org.minesweeper.core.Cell[] row : board) {
        for (org.minesweeper.core.Cell cell : row) {
            if (!((hasMine(cell)) || (hasBeenRevealed(cell)))) {
                win = false;
                break;
            }
        }
    }
    win |= getMarkedCells().containsAll(java.util.Arrays.asList(mines));
    if (win) {
        revealAll();
    }
    return win;
}