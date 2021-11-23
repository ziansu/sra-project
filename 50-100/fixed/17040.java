public void updateTotalRoundsPlayed(int add, boolean notifyUser) {
    addValue(StatisticType.TOTAL_ROUNDS_PLAYED, add);
    if ((!(playerAchievements.hasUnlocked(Achievements.PLAY_A_ROUND))) && ((this.statistics.get(StatisticType.TOTAL_ROUNDS_PLAYED)) >= 1)) {
        playerAchievements.addAchievement(Achievements.PLAY_A_ROUND, notifyUser);
    }
    if ((!(playerAchievements.hasUnlocked(Achievements.PLAY_FIVE_ROUNDS))) && ((this.statistics.get(StatisticType.TOTAL_ROUNDS_PLAYED)) >= 5)) {
        playerAchievements.addAchievement(Achievements.PLAY_FIVE_ROUNDS, notifyUser);
    }
}