public final void stopLevel() {
    level.stop();
    for (gamelogic.Game.GameObserver o : observers) {
        o.resetBoard();
    }
    for (gamelogic.Game.GameObserver o : observers) {
        if (level.checkHassucceeded(score.getScore())) {
            o.levelscreen();
        }else {
            o.gameoverscreen();
        }
    }
}