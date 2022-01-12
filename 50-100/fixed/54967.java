public void nextTurn() {
    if (((((activeUser) + 1) / (userCount)) > 0) && ((activeRound) > 0)) {
        completeDemoRound();
    }
    activeRound += ((activeUser) + 1) / (userCount);
    activeUser = ((activeUser) + 1) % (userCount);
}