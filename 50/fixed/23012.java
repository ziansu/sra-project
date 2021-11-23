private boolean achievementsEnabledFor(org.bukkit.OfflinePlayer player) {
    one.lindegaard.MobHunting.achievements.PlayerStorage storage = mStorage.get(player.getUniqueId());
    if (storage == null)
        return false;
    
    return storage.enableAchievements;
}