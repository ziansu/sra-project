@javafx.fxml.FXML
private void showWagons(com.harambeshabitat.app.model.Train t) throws java.net.URISyntaxException {
    java.util.ArrayList<com.harambeshabitat.app.model.Wagon> wagons = t.getWagons();
    x = com.harambeshabitat.app.view.GUISceneController.PADDING;
    javafx.scene.canvas.GraphicsContext graphicsContext = trainCanvas.getGraphicsContext2D();
    for (com.harambeshabitat.app.model.Wagon w : wagons) {
        enlargeCanvas();
        x += (getImage(w.getId()).getWidth()) + (com.harambeshabitat.app.view.GUISceneController.PADDING);
        graphicsContext.drawImage(getImage(w.getId()), x, 5);
        (visiblewagons)++;
        java.lang.System.out.println(visiblewagons);
    }
}