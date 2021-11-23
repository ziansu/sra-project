public us.talabrek.ultimateskyblock.player.PlayerInfo loadPlayerData(org.bukkit.entity.Player player) {
    com.google.common.base.Preconditions.checkState((!(org.bukkit.Bukkit.isPrimaryThread())), "This method cannot run in the main server thread!");
    return loadPlayerData(player.getUniqueId(), player.getName());
}