private void clearCanvases() {
    for (javafx.scene.Node n : this.getChildren()) {
        ((javafx.scene.canvas.Canvas) (n)).getGraphicsContext2D().clearRect(0, 0, this.getWidth(), this.getHeight());
    }
}