private void clearCanvases() {
    for (javafx.scene.Node n : this.getChildren()) {
        if (n instanceof javafx.scene.canvas.Canvas) {
            ((javafx.scene.canvas.Canvas) (n)).getGraphicsContext2D().clearRect(0, 0, this.getWidth(), this.getHeight());
        }
    }
}