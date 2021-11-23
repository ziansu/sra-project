public void applyMove(int[][] move) {
    if ((((move.length) != 2) || ((move[0].length) != 2)) || ((move[1].length) != 2)) {
        throw new java.lang.IllegalArgumentException("Move has invalid dimensions.");
    }
    setBoard(move[0]);
    addMarker(move[1]);
}