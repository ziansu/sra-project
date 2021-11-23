public void removeNecessaryAchievement(data.Achievement achievement) {
    if ((necessaryAchievements) == null) {
        necessaryAchievements = new java.util.ArrayList<data.Achievement>();
    }
    if (necessaryAchievements.contains(achievement)) {
        necessaryAchievements.remove(achievement);
    }else {
    }
}