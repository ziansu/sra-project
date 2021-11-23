public void addTo(javafx.scene.layout.Pane canvas) {
    for (javafx.scene.Node node : nodes) {
        canvas.getChildren().add(node);
    }
}