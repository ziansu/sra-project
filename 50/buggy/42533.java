public void removeAdditionalAchievement(data.Achievement achievement) {
    if ((additionalAchievements) == null) {
        additionalAchievements = new java.util.ArrayList<data.Achievement>();
    }
    if (additionalAchievements.contains(achievement)) {
        additionalAchievements.remove(additionalAchievements);
    }else {
    }
}