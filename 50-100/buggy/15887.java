private int getLevelDone(org.bukkit.entity.Player player) {
    for (int result = 1; result <= (Settings.challengeLevels.size()); result++) {
        if ((checkLevelCompletion(player, Settings.challengeLevels.get((result - 1)))) > 0) {
            return result;
        }
    }
    return Settings.challengeLevels.size();
}