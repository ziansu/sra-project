public void roundCompleteUpdate(java.util.ArrayList<java.lang.Integer> pressedKeys, java.util.ArrayList<edu.virginia.engine.controller.GamePad> gamePads) {
    levelContainer.update(pressedKeys, gamePads);
    if ((roundCompleteClock.getElapsedTime()) > 1000) {
        gameMode = edu.virginia.lab1test.TheMinorsGame.GameMode.ITEM_SELECTION;
        resetPlayers(pressedKeys, gamePads);
        levelContainer.update(pressedKeys, gamePads);
    }
}