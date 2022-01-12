private void updateScoreboardAndArrays(int category, int zeroIndexedPlayerTurn, int score) {
    scoreboard[category][zeroIndexedPlayerTurn] = score;
    categories[category][zeroIndexedPlayerTurn] = 1;
    display.updateScorecard(category, (zeroIndexedPlayerTurn + 1), score);
    calculateAndAddTotalScore(zeroIndexedPlayerTurn);
}