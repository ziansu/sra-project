private void updateCell(int row, int col) {
    javafx.scene.shape.Rectangle r = getRectangle(row, col);
    if (game.isAlive(row, col)) {
        r.setFill(com.jsaop.conways.app.GameOfLife.CELL_FILL_COLOR);
        r.setStroke(com.jsaop.conways.app.GameOfLife.CELL_FILL_COLOR);
    }else {
        r.setFill(javafx.scene.paint.Color.BLACK);
        r.setStroke(javafx.scene.paint.Color.BLACK);
    }
}