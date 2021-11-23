javafx.scene.image.WritableImage getSnapShot(javafx.scene.canvas.Canvas canvas, int x, int y, int w, int h) {
    javafx.scene.SnapshotParameters parameters = new javafx.scene.SnapshotParameters();
    parameters.setViewport(new javafx.geometry.Rectangle2D(x, y, (w + x), (h + y)));
    javafx.scene.image.WritableImage wi = new javafx.scene.image.WritableImage(w, h);
    javafx.scene.image.WritableImage snapshot = canvas.snapshot(parameters, wi);
    return snapshot;
}