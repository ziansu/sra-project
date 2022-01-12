public static me.tehbeard.BeardAch.achievement.Achievement getAchievement(int i) {
    if ((i > 0) && (i <= (me.tehbeard.BeardAch.achievement.AchievementManager.achievements.size()))) {
        return me.tehbeard.BeardAch.achievement.AchievementManager.achievements.get((i - 1));
    }
    return null;
}