@java.lang.Override
public com.three_stack.digital_compass.backend.BasicGameState processAction(com.three_stack.digital_compass.backend.BasicAction action, com.three_stack.digital_compass.backend.BasicGameState state) {
    testGame.GameState gameState = ((testGame.GameState) (state));
    testGame.EndAction revealAction = ((testGame.EndAction) (action));
    if (revealAction.isRestart()) {
        gameState.resetGame();
        gameState.setCurrentPhase(new testGame.LiePhase(gameState));
    }
    return gameState;
}