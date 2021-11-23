@org.bukkit.event.EventHandler
public void onInteract(org.bukkit.event.player.PlayerInteractEvent e) {
    if ((e.getAction()) == (org.bukkit.event.block.Action.RIGHT_CLICK_AIR)) {
        org.bukkit.entity.Player p = e.getPlayer();
        for (org.bukkit.entity.Player player : getServer().getOnlinePlayers()) {
            Dev.BarnyardMC.util.ParticleMath.PushBack(p, player, 5);
        }
    }
}