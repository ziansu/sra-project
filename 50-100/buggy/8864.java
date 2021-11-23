private void addCanvasToRootPane(javafx.scene.image.Image image) {
    rootPane.setPrefWidth(image.getWidth());
    rootPane.setPrefHeight(image.getHeight());
    rootPane.getChildren().add(canvas);
    javafx.scene.layout.StackPane.setAlignment(canvas, javafx.geometry.Pos.TOP_CENTER);
}