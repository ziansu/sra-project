private void updateCell(int x, int y) {
    javafx.scene.shape.Rectangle r = getRectangle(x, y);
    if (game.isAlive(x, y)) {
        r.setFill(com.jsaop.conways.app.GameOfLife.CELL_FILL_COLOR);
        r.setStroke(com.jsaop.conways.app.GameOfLife.CELL_FILL_COLOR);
    }else {
        r.setFill(javafx.scene.paint.Color.BLACK);
        r.setStroke(javafx.scene.paint.Color.BLACK);
    }
}