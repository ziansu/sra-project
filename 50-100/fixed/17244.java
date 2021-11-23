private void resetCanvasSizes() {
    for (javafx.scene.Node n : this.getChildren()) {
        ((javafx.scene.canvas.Canvas) (n)).setHeight(this.getHeight());
        ((javafx.scene.canvas.Canvas) (n)).setWidth(this.getWidth());
    }
}