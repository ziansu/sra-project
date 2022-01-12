public boolean hasPermission(java.lang.String playerName, java.lang.String perm) {
    org.bukkit.entity.Player player = org.bukkit.Bukkit.getPlayer(playerName);
    if (player != null) {
        return player.hasPermission((((com.Ben12345rocks.VotingPlugin.Utils.plugin.getName()) + ".") + perm));
    }
    return false;
}