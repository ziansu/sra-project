public boolean isNeighbor(Model.BasicCell other) {
    int col = getColumn();
    int row = getRow();
    int othercol = other.getColumn();
    int otherrow = other.getRow();
    return (rowNeighbor(row, otherrow)) && (colNeighbor(col, othercol));
}