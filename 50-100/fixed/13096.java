public boolean moveRight() {
    if ((xPosition) >= ((grid.getColumnCountAtRow(yPosition)) - 1)) {
        return false;
    }
    if ((getCellAtCurrentPosition().getValue()) <= (getCell(((xPosition) + 1), yPosition).getValue())) {
        return false;
    }
    (xPosition)++;
    return true;
}