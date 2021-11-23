public static int roll(int numSides, int numDice) {
    int sum = 0;
    for (int i = 0; i < numDice; i++) {
        sum += ((int) ((java.lang.Math.random()) * numSides)) + 1;
    }
    return numSides == 0 ? 0 : sum;
}