public void setCurrentGameState(final net.realrpg.common.GameModel.GameState gameState) {
    if ((currentGameState) != null) {
        currentGameState.getController().closeView();
    }
    currentGameState = gameState;
    java.lang.System.out.println((("\n#### " + gameState) + " ####\n"));
    if (currentGameState.getController().displayView()) {
        start();
    }
}