private void calculatePack(java.util.UUID playerId) {
    if (plugin.isEnabled()) {
        org.bukkit.entity.Player player = plugin.getServer().getPlayer(playerId);
        if (player != null) {
            java.lang.String worldName = "";
            if ((player.getServer()) != null) {
                worldName = player.getWorld().getName();
            }
            plugin.getPackManager().applyPack(player.getUniqueId(), worldName);
        }
    }
}