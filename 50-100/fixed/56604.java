public void enemyTurn() {
    for (int i = 1; i < (Board.BOARDSIZE); i++) {
        if (((squares[i].getOccupiedType()) > 1) && ((squares[(i - 1)].getOccupiedType()) == 0)) {
            try {
                squares[i].moveContents(squares[(i - 1)]);
            } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            }
        }
    }
}