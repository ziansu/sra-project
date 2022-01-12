public javafx.scene.paint.Color getFillFor(int x, int y, handwriting.learners.som.SOMPoint node) {
    double value = map[node.x()][node.y()][x][y];
    return new javafx.scene.paint.Color(value, value, value, 1.0);
}