private void moveTurnPlayer() {
    {
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