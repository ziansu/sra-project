public void levelReset() {
    nl.tudelft.semgroup4.util.Audio.stopFireSound();
    if ((getPlayerLives()) > 0) {
        resetPlayers();
        setCurLevel(levelFact.getLevel(getCurLevel().getId()));
    }else {
        gameOver();
    }
}