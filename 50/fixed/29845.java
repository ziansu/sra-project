public void addUnit(com.alvarpq.GOTF.coreGame.units.Unit unit, com.alvarpq.GOTF.coreGame.board.BoardHalf opponentsSide) {
    units[unit.getRow()][unit.getColumn()] = unit;
    updateUnits(opponentsSide);
}