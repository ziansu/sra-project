private int getLevelDone(org.bukkit.entity.Player player) {
    for (int result = 0; result < (Settings.challengeLevels.size()); result++) {
        if ((checkLevelCompletion(player, Settings.challengeLevels.get(result))) > 0) {
            return result;
        }
    }
    return (Settings.challengeLevels.size()) - 1;
}