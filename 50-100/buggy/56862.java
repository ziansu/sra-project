public void clear() {
    struct_render_mapping.clear();
    RENDERS.getChildren().clear();
    ANIMATED.getGraphicsContext2D().clearRect(0, 0, this.getWidth(), this.getHeight());
    application.visualization.Visualization.hintPane.setVisible(true);
}