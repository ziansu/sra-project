private void resize() {
    clearCanvas();
    paintingCanvas.setWidth(((rightAnchor.getWidth()) - 14.0));
    paintingCanvas.setHeight(((rightAnchor.getHeight()) - 14.0));
    draw();
}