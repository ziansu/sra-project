private javafx.scene.layout.FlowPane createGameComponents() {
    javafx.scene.layout.FlowPane gameFlowPane = new javafx.scene.layout.FlowPane();
    gameFlowPane.setPadding(new javafx.geometry.Insets(10, 0, 0, 10));
    this.canvas = new javafx.scene.canvas.Canvas(util.Constants.canvasWidth, util.Constants.canvasHeight);
    javafx.scene.canvas.GraphicsContext gc = canvas.getGraphicsContext2D();
    game.gc = gc;
    gameFlowPane.getChildren().add(canvas);
    canvas.requestFocus();
    return gameFlowPane;
}