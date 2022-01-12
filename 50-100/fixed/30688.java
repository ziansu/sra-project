public int SelectObj(double x, double y, javafx.scene.canvas.GraphicsContext gc) {
    for (int i = (objectList.size()) - 1; i >= 0; i--) {
        if (objectList.get(i).clickInObj(x, y)) {
            unSelectAll();
            objectList.get(i).setSelected();
            drawOnCanvas(gc);
            return i;
        }
    }
    return -1;
}