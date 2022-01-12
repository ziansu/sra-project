private int levelCalculator(int threatLevel) {
    java.util.Random random = new java.util.Random();
    double supermobLevelPercent = 0.01 + ((0.2 - 0.01) * (random.nextDouble()));
    int supermobLevel = ((int) (supermobLevelPercent * threatLevel));
    if (supermobLevel < 1) {
        return 1;
    }
    org.bukkit.Bukkit.getLogger().info(((((("level " + supermobLevel) + " mob spawned? ") + threatLevel) + " * ") + supermobLevelPercent));
    return supermobLevel;
}