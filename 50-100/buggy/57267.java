private void checkGameState() {
    timeFromStart += Gdx.graphics.getDeltaTime();
    if ((currentGameState) >= (gameStateInterWalls.length)) {
        return ;
    }
    if ((timeFromStart) > (gameStateInterWalls[currentGameState])) {
        java.lang.System.out.println(((java.lang.Math.round(timeFromStart)) + "INCREASING!!"));
        (currentGameState)++;
        increaseDifficulty();
    }
}