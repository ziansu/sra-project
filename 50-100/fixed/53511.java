public javafx.scene.paint.Color getFillFor(int x, int y, handwriting.learners.som.SOMPoint node) {
    double value = map[node.x()][node.y()][x][y];
    if (value < 0) {
        value = 0.0;
    }else
        if (value > 1) {
            value = 1.0;
        }
    
    return new javafx.scene.paint.Color(value, value, value, 1.0);
}