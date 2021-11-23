public void endOfGame() {
    javafx.stage.Stage nextGameStage = new javafx.stage.Stage();
    javafx.scene.layout.StackPane gameOverWindow = createGameOverWindow(nextGameStage);
    javafx.scene.Scene scene = new javafx.scene.Scene(gameOverWindow, 200, 100);
    nextGameStage.setScene(scene);
    nextGameStage.show();
}