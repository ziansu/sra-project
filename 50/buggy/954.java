private boolean isSquareEmpty(int x, int y) {
    if ((this.getStationaryType(x, y)) == (SquareType.EMPTY)) {
        return true;
    }
    return false;
}