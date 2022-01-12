public void setWindow(javafx.stage.Window window) {
    this.window = window;
    mapScrollPane.setVmax(0);
    mapScrollPane.setHmax(0);
    window.heightProperty().addListener(( e) -> {
        mapRootPane.updateCanvasSize(mapContainer.getWidth(), mapContainer.getHeight());
    });
    window.widthProperty().addListener(( e) -> {
        mapRootPane.updateCanvasSize(mapContainer.getWidth(), mapContainer.getHeight());
    });
}