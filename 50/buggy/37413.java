public int updateStake() {
    stakeTracker = (stakeTracker) - (getBet());
    if ((stakeTracker) <= 0) {
        stakeTracker = 1499;
    }
    return stakeTracker;
}