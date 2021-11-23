public int updateBet(int addedBet) {
    if (((betTracker) + addedBet) < (stakeTracker)) {
        betTracker = addedBet + (betTracker);
        return betTracker;
    }else {
        betTracker = stakeTracker;
        return betTracker;
    }
}