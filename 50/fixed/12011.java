public void addTo(javafx.scene.layout.Pane canvas) {
    for (javafx.scene.Node node : nodes) {
        if (!(canvas.getChildren().contains(node))) {
            canvas.getChildren().add(node);
        }
    }
}