@java.lang.Override
public void removePlayerFromGame(java.util.UUID playerUuid, boolean respawn, boolean broadcast) {
    org.apache.commons.lang.Validate.notNull(playerUuid, "Player uuid cannot be nuller");
    org.bukkit.entity.Player p = plugin.getServer().getPlayer(playerUuid);
    org.apache.commons.lang.Validate.isTrue((p != null), java.lang.String.format("Player (uuid: %s) not online", playerUuid));
    this.removePlayerFromGame(p, respawn, broadcast);
}