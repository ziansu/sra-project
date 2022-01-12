private void moveTurnPlayer() {
    if (gameState.getHasRolled()) {
        outputText = "You have used your roll for this turn\n";
    }else {
        int[] rollArray = new int[2];
        int rollSum = 0;
        for (int i = 0; i < 2; i++) {
            int move = rollDice();
            rollArray[i] = move;
            rollSum += move;
        }
        moveTurnPlayer(rollArray);
    }
}