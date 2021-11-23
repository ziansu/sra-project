private void redraw(javafx.scene.canvas.GraphicsContext gc) {
    gc.setFill(javafx.scene.paint.Color.GRAY);
    gc.fillRect(0, 0, this.canvas.getWidth(), this.canvas.getHeight());
    for (int i = 0; i < (getFieldWidth()); i++) {
        for (int j = 0; j < (getFieldHeight()); j++) {
            drawCalculatedCell(gc, i, j);
        }
    }
    drawCellsUnderCursor(gc);
}