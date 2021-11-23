private void setupPrimaryStage(javafx.stage.Stage primaryStage) {
    javafx.geometry.Rectangle2D visualBounds = javafx.stage.Screen.getPrimary().getVisualBounds();
    pdfcreator.App.setPrimaryStage(primaryStage);
    primaryStage.setTitle(pdfcreator.App.TITLE);
    primaryStage.setX(visualBounds.getMinX());
    primaryStage.setY(visualBounds.getMinY());
    primaryStage.setWidth(visualBounds.getWidth());
    primaryStage.setHeight(visualBounds.getHeight());
}