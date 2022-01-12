private void createLayers() {
    layer1 = new javafx.scene.canvas.Canvas(width, hieght);
    layer2 = new javafx.scene.canvas.Canvas(width, hieght);
    gc1 = layer1.getGraphicsContext2D();
    javafx.scene.image.Image img = new javafx.scene.image.Image(CommonDefs.GuiCommonDefs.storeMapPicPath, width, hieght, true, true);
    gc1.drawImage(img, 0, 0);
    gc2 = layer2.getGraphicsContext2D();
    gc2.setFill(javafx.scene.paint.Color.BLUE);
    gc2.fillOval(100, 100, 20, 20);
}