public void phaseEndRound() {
    (round)++;
    if (((Main.human.hasContinents) < 1) || ((Main.computer.hasContinents) < 1)) {
        gameOver();
    }else {
        gamephase = gamelogic.Game.PHASE_REINFORCE;
    }
}