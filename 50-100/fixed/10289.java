public void setDisplayName(final org.bukkit.entity.Player player) {
    final java.lang.String prefix = searchNodes(player, "prefix");
    final java.lang.String suffix = (searchNodes(player, "suffix")) + "§f";
    player.setDisplayName(((prefix + (org.bukkit.ChatColor.stripColor(player.getName()))) + suffix));
    players.put(player.getName(), player.getWorld().getUID());
}