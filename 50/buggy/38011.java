protected void gameOver(meteoroids.Meteoroids.gameobjects.GameObject kill) {
    exit();
    if (kill != null) {
        objectController.killGameObject(kill);
    }
    meteoroids.Meteoroids.controllers.gamestates.GameStateGameOver gameOverGameState = new meteoroids.Meteoroids.controllers.gamestates.GameStateGameOver(controller, objectController);
    controller.addGameState(gameOverGameState);
}