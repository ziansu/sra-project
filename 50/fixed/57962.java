@java.lang.Override
public final void setupPlayer(java.lang.String player) {
    org.bukkit.entity.Player p = plugin.getServer().getPlayer(player);
    if (p != null)
        setupPlayer(p);
    
}