@org.bukkit.event.EventHandler
public void onDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    if ((event.getEntity()) instanceof org.bukkit.entity.Player) {
        org.bukkit.entity.Player player = ((org.bukkit.entity.Player) (event.getEntity()));
        if (core.isBroken(player)) {
            core.removeBroken(player);
            player.setAllowFlight(true);
            core.setFlying(player, true);
            messagePlayer(player, "wHealed", null);
        }
    }
}