static void loseALife() {
    Game.LevelGenerator.timer.stop();
    Game.LevelGenerator.stickFigure.loseALife();
    if (Game.LevelGenerator.stickFigure.isDead()) {
        Game.LevelGenerator.gameBackground.getGameBar().getChildren().remove(2);
        Game.LevelGenerator.gameBackground.getGameBar().getChildren().add(new javafx.scene.control.Label("     "));
        Game.LevelGenerator.gameOver();
        return ;
    }
    Game.LevelGenerator.gameBackground.getLivesBar().getChildren().remove(0);
}