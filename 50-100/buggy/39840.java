private void completeDemoRound() {
    for (models.MockPlayer p : getPlayers()) {
        p.getScores()[activeRound] = ((int) (21 * (java.lang.Math.random())));
    }
    for (models.User u : users) {
        u.updateUserStats(activeRound);
    }
}