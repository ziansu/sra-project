public void levelReset() {
    nl.tudelft.semgroup4.util.Audio.stopFireSound();
    if ((getPlayerLives()) > 0) {
        setCurLevel(levelFact.getLevel(getCurLevel().getId()));
        resetPlayers();
    }else {
        gameOver();
    }
}