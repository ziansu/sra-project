public void render(javafx.scene.canvas.GraphicsContext graphicsContext) {
    graphicsContext.setFill(javafx.scene.paint.Color.DARKGREY);
    graphicsContext.fillRect(0, 0, graphicsContext.getCanvas().getWidth(), graphicsContext.getCanvas().getHeight());
    graphicsContext.setFont(stageTitleFont);
    for (int i = 0; i < (stageList.size()); i++) {
        game.stage.Stage stage = stageList.get(i);
    }
}