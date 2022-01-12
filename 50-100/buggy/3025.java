public void applyMove(int[][] move) {
    if ((((move.length) != 2) || ((move[0].length) != 2)) || ((move[1].length) != 2)) {
        throw new java.lang.IllegalArgumentException("Move has invalid dimensions.");
    }
    setBoard(move[0][0], move[0][1]);
    addMarker(move[1][0], move[1][1]);
}