public void enemyTurn() {
    for (int i = 0; i < (Board.BOARDSIZE); i++) {
        if ((squares[i].getOccupiedType()) > 1) {
            try {
                squares[i].moveContents(squares[(i - 1)]);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            }
        }
    }
}