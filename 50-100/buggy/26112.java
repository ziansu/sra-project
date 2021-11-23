@java.lang.Override
public void onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    if (!(isEnabled()))
        return ;
    
    if (hasPlayer(event.getPlayer())) {
        if (!(playerMayTeleport(event.getPlayer()))) {
            event.getPlayer().sendMessage(((org.bukkit.ChatColor.DARK_RED) + (de.beimax.simplespleef.SimpleSpleef.ll("errors.teleport", "[ARENA]", getName()))));
            event.setCancelled(true);
        }
    }
}