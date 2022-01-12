@java.lang.Override
public void onDisable() {
    for (org.bukkit.entity.Player player : getServer().getOnlinePlayers()) {
        com.pgcraft.spectatorplus.spectators.Spectator spectator = getPlayerData(player);
        if (spectator.isSpectating()) {
            spectator.setSpectating(false, true);
            spectator.saveSpectatorModeInFile(true);
        }
    }
    arenasManager.save();
    spectatorsManager.save();
    super.onDisable();
}