public void setWindow(javafx.stage.Window window) {
    this.window = window;
    mapScrollPane.setVmax(0);
    mapScrollPane.setHmax(0);
    mapContainer.heightProperty().addListener(( e) -> {
        mapRootPane.updateCanvasSize(mapContainer.getWidth(), mapContainer.getHeight());
    });
    mapContainer.widthProperty().addListener(( e) -> {
        mapRootPane.updateCanvasSize(mapContainer.getWidth(), mapContainer.getHeight());
    });
}