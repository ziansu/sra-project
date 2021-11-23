public int roll() {
    if ((rollsSinceLastReseed) >= 100000) {
        com.valkryst.VDice.DiceRoller.random.setSeed(java.lang.System.currentTimeMillis());
        rollsSinceLastReseed = 0;
    }
    int total = 0;
    for (final com.valkryst.VDice.Die die : dice) {
        total += die.roll(com.valkryst.VDice.DiceRoller.random);
        (rollsSinceLastReseed)++;
    }
    return total;
}