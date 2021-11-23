@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOWEST)
public void onPlayerLogin(org.bukkit.event.player.PlayerLoginEvent event) {
    org.bukkit.entity.Player player = event.getPlayer();
    if (!(DimRestrictor.plugin.checkWorld(player.getWorld().getName()))) {
        synchronized(DimRestrictor.plugin.playersToCheck) {
            if (DimRestrictor.plugin.playersToCheck.add(player)) {
                player.sendMessage(("You can\'t teleport to this world.\n" + (DimRestrictor.plugin.info(player.getWorld().getName()))));
                net.kaikk.mc.DimRestrictor.DimRestrictor.teleportPlayer(player, player.getLocation());
            }
        }
    }
}