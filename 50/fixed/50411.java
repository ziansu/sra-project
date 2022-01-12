private javafx.scene.shape.Rectangle getRectangle(int x, int y) {
    return ((javafx.scene.shape.Rectangle) (grid.getChildren().get(getIndex(x, y))));
}