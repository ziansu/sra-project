public static int get(java.lang.String key) {
    java.lang.Integer val = com.github.fishio.achievements.AchievementIO.achievemap.get(key);
    if (val == null) {
        com.github.fishio.achievements.AchievementIO.load();
        val = com.github.fishio.achievements.AchievementIO.achievemap.get(key);
    }
    if (val == null) {
        return 0;
    }
    return val.intValue();
}