private void completeDemoRound() {
    for (models.MockPlayer p : getPlayers()) {
        p.getScores()[((activeRound) - 1)] = ((int) (21 * (java.lang.Math.random())));
    }
    for (models.User u : users) {
        u.updateUserStats(activeRound);
    }
}