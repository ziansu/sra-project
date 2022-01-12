private void initGUI() {
    canvasContainer = new javafx.scene.control.ScrollPane(canvas);
    borderPane = new javafx.scene.layout.BorderPane(canvasContainer);
    tilesPane = new javafx.scene.layout.VBox();
    splitPane = new javafx.scene.control.SplitPane(borderPane, tilesPane);
    splitPane.setOrientation(javafx.geometry.Orientation.VERTICAL);
    splitPane.setDividerPositions(0.8);
    javafx.scene.control.SplitPane.setResizableWithParent(borderPane, false);
    canvasContainer.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
    canvasContainer.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.NEVER);
    canvasContainer.getStyleClass().add(CssConstants.CANVAS_CONTAINER_LIGHT_BG);
}