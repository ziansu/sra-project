public org.bukkit.entity.Player[] getOnlinePlayers() {
    return DeityAPI.plugin.getServer().getOnlinePlayers().toArray(new org.bukkit.entity.Player[0]);
}