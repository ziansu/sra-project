private edu.illinois.ugl.minrvaestimote.GridMap.Cell convertUserCoordsToGridCell(double x, double y) {
    double gridXCm = (LIB_X_CM) / (grid.length);
    double gridYCm = (LIB_Y_CM) / (grid[0].length);
    int cellX = ((int) (x / gridXCm));
    int cellY = ((int) (y / gridYCm));
    return grid[cellX][cellY];
}