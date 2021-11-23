private edu.illinois.ugl.minrvaestimote.GridMap.Cell convertUserCoordsToGridCell(double x, double y) {
    double xCm = x * 100;
    double yCm = y * 100;
    double gridXCm = (LIB_X_CM) / (grid.length);
    double gridYCm = (LIB_Y_CM) / (grid[0].length);
    int cellX = ((int) (xCm / gridXCm));
    int cellY = ((int) (yCm / gridYCm));
    return grid[cellX][cellY];
}