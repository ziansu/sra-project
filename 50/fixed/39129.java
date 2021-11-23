public void removeUnit(int row, int column, com.alvarpq.GOTF.coreGame.board.BoardHalf opponentsSide) {
    units[row][column] = null;
    updateUnits(opponentsSide);
}