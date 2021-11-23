public javafx.geometry.BoundingBox getCellBoundingBox(int col, int row) {
    com.badlogic.gdx.math.Vector2 centre = cellCentres[row][col];
    float halfCellSize = (cellSize) / 2;
    return new javafx.geometry.BoundingBox(((centre.x) - halfCellSize), ((centre.y) - halfCellSize), ((centre.x) + halfCellSize), ((centre.y) + halfCellSize));
}