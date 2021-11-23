private void updateControllers(float delta) {
    if ((gameState) == (com.mattwrench.function.screens.GameScreen.GameState.PLAYING)) {
        playerController.update(delta);
        projectileController.update(delta);
    }
}