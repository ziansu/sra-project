public int SelectObj(double x, double y, javafx.scene.canvas.GraphicsContext gc) {
    for (int i = 0; i < (objectList.size()); i++) {
        if (objectList.get(i).clickInObj(x, y)) {
            unSelectAll();
            objectList.get(i).setSelected();
            drawOnCanvas(gc);
            return i;
        }
    }
    return -1;
}