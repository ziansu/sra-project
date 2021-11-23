public synchronized void fit() {
    stopDrawing();
    location = new java.awt.geom.Point2D.Double((-2.5), (-1));
    scale = 1 / 200.0;
    show(new java.awt.Rectangle(0, 0, ((int) (3.5 / (scale))), ((int) (2.0 / (scale)))));
}