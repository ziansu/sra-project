private void unlinkSpotsToVehicle(int row, int col, int spaces, boolean vert) {
    RowCol[] locations = generatePlacementLocations(row, col, spaces, vert);
    for (int i = 0; i < (locations.length); i++) {
        board[locations[i].getRow()][locations[i].getCol()] = null;
    }
}