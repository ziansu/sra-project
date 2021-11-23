private javafx.scene.shape.Rectangle getRectangle(int row, int col) {
    return ((javafx.scene.shape.Rectangle) (grid.getChildren().get(getIndex(row, col))));
}