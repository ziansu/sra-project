private void gameOver() {
    cancelPlayer();
    for (int i = 0; i < (simonSeqCurrent); i++) {
        simonSequence[i] = 0;
    }
    simonSeqCurrent = 0;
    resetCheckValues();
    isSimonsTurn = false;
    playSound(buzzer_Id);
    if ((nextRoundTask) != null) {
        nextRoundTask = null;
    }
    gameOverTitle();
}