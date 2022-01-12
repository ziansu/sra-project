private void makeNewLayer(java.lang.String layerName) {
    if (!(layerName.isEmpty())) {
        javafx.scene.canvas.Canvas canvas = new javafx.scene.canvas.Canvas(Main.WIDTH, Main.HEIGHT);
        Main.layerStrings.add(layerName);
        Main.layers.put(layerName, canvas);
        Main.layerSelector.getItems().add(layerName);
        Main.layerSelector.setValue(layerName);
        Main.pane.getChildren().add(0, canvas);
        Main.cursorCanvas.toFront();
    }
}