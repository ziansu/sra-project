public void drawMap(javafx.scene.canvas.GraphicsContext gc, java.util.List<MapElement> mapElements, javafx.scene.Group root) {
    makeBackground(gc);
    drawGridLines(gc);
    drawMapElements(gc, mapElements, root);
}