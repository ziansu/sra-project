public java.util.List<org.dungeon.achievements.UnlockedAchievement> getUnlockedAchievements(java.util.Comparator<org.dungeon.achievements.UnlockedAchievement> comparator) {
    if (comparator == null) {
        throw new java.lang.IllegalArgumentException("comparator is null.");
    }
    java.util.List<org.dungeon.achievements.UnlockedAchievement> list = new java.util.ArrayList<org.dungeon.achievements.UnlockedAchievement>(unlockedAchievements);
    java.util.Collections.sort(list, comparator);
    return list;
}