private void addGameOverTextToScreen() {
    javafx.scene.control.Label gameOverLabel = new javafx.scene.control.Label("GAME OVER!");
    gameOverLabel.setId("gameOverLabel");
    gameOverLabel.setLayoutX(30);
    gameOverLabel.setLayoutY(30);
    gameScreenLayout.getChildren().add(gameOverLabel);
}