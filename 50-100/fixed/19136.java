public void updateUserStats(int round) {
    for (models.MockPlayer p : roster.getPlayers()) {
        userStats.updatePlayerStats(p, round, roster.getSubs().contains(p), ((roster.getCaptain()) == null ? false : roster.getCaptain().equals(p)));
    }
}