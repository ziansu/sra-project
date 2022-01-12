private void playGame() {
    for (int round = 0; round < (N_SCORING_CATEGORIES); round++) {
        for (int playerNumber = 1; playerNumber <= (nPlayers); playerNumber++) {
            firstRoll(playerNumber);
            display.waitForPlayerToSelectDice();
            nextTwoRoll(playerNumber);
            selectedCategory(playerNumber);
        }
    }
}