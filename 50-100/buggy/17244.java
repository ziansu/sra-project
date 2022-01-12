private void resetCanvasSizes() {
    for (javafx.scene.Node n : this.getChildren()) {
        if (n instanceof javafx.scene.canvas.Canvas) {
            ((javafx.scene.canvas.Canvas) (n)).setHeight(this.getHeight());
            ((javafx.scene.canvas.Canvas) (n)).setWidth(this.getWidth());
        }
    }
}