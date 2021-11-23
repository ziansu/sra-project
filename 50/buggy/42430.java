public int getRoundResult() {
    int roundResult = getSumOfPinsDown();
    if (!(isFinal())) {
        roundResult += getSumOfBonusPoints();
    }else {
        roundResult += getSumOfBonusPointsFinal();
    }
    return roundResult;
}