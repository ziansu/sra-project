public int getRoundResult() {
    int roundResult = getSumOfPinsDown();
    if (!(isFinal())) {
        roundResult += getSumOfBonusPoints();
    }
    return roundResult;
}