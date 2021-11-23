private void phaseMinusOneAbility() {
    if ((phaseMinusOne) || ((currentRound) == (com.boardgame.friday.GameActivity.Round.YELLOW))) {
        currentHazardStrength = drawnHazard.getHazardStrength(com.boardgame.friday.GameActivity.Round.GREEN.ordinal());
        updateHazardStrengthCounter();
        gameBoard.setBackgroundResource(R.color.greenBackground);
        phaseMinusOne = true;
    }else
        if ((currentRound) == (com.boardgame.friday.GameActivity.Round.RED)) {
            currentHazardStrength = drawnHazard.getHazardStrength(com.boardgame.friday.GameActivity.Round.YELLOW.ordinal());
            updateHazardStrengthCounter();
            gameBoard.setBackgroundResource(R.color.yellowBackground);
            phaseMinusOne = true;
        }
    
}