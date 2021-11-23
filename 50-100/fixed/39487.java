protected int checkLevelCompletion(final org.bukkit.entity.Player player, final java.lang.String level) {
    int challengesCompleted = 0;
    java.util.List<java.lang.String> levelChallengeList = challengeList.get(level);
    if (levelChallengeList != null) {
        for (java.lang.String challenge : levelChallengeList) {
            if (players.checkChallenge(player.getUniqueId(), challenge)) {
                challengesCompleted++;
            }
        }
        return ((levelChallengeList.size()) - (Settings.waiverAmount)) - challengesCompleted;
    }
    return 0;
}