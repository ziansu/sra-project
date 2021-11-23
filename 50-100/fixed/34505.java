@org.bukkit.event.EventHandler
public void onSpectatorBlockPlace(org.bukkit.event.block.BlockCanBuildEvent e) {
    org.bukkit.block.Block b = e.getBlock();
    com.thebubblenetwork.api.game.Location loc = b.getLocation();
    for (com.thebubblenetwork.api.game.Player p : b.getWorld().getPlayers()) {
        if ((isSpectating(p)) && ((p.getLocation().distanceSquared(loc)) <= 2.0)) {
            e.setBuildable(true);
            return ;
        }
    }
}