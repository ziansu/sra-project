public boolean hasPermission(java.lang.String playerName, java.lang.String perm) {
    if (playerName == null) {
        return false;
    }
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(playerName);
    if (player != null) {
        return player.hasPermission((((com.Ben12345rocks.VotingPlugin.Utils.plugin.getName()) + ".") + perm));
    }
    return false;
}