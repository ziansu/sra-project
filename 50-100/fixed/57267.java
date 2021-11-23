private void checkGameState() {
    timeFromStart += Gdx.graphics.getDeltaTime();
    if ((currentGameState) >= (gameStateInterWalls.length)) {
        return ;
    }
    if ((timeFromStart) > (gameStateInterWalls[currentGameState])) {
        (currentGameState)++;
        increaseDifficulty();
    }
}