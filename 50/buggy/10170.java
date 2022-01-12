@java.lang.Override
public void endEngine() {
    pl.engine.Utils.debug("END GAME..");
    gameManager.stopTimer();
    gameManager.summaryScoreByGame(this, teams);
    gc.nextEngine();
}