private void addOnlinePlayers() {
    for (final org.bukkit.entity.Player p : plugin.getServer().getOnlinePlayers()) {
        get(p);
    }
}