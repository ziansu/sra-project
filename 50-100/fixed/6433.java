public void handle(javafx.scene.input.MouseEvent event) {
    isDragDetected = true;
    root.setLayoutX(((event.getSceneX()) - (startX)));
    root.setLayoutY(((event.getSceneY()) - (startY)));
    node.setStartPoint(new model.Point(root.getLayoutX(), root.getLayoutY()));
    mainPanel.redrawArc(self);
}