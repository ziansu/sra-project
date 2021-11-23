public java.util.List<java.lang.Integer> getTower(int x, int y) throws exc.CoordinatesOutOfBoundsException {
    if (!(isValidTower(x, y))) {
        throw new exc.CoordinatesOutOfBoundsException(x, y, this);
    }
    return boardData.get(((x - 1) + ((y - 1) * (xDim))));
}