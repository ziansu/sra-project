@java.lang.Override
public boolean onPlayerTeleport(org.bukkit.event.player.PlayerTeleportEvent event) {
    if (!(isEnabled()))
        return false;
    
    if (hasPlayer(event.getPlayer())) {
        if (!(playerMayTeleport(event.getPlayer()))) {
            event.getPlayer().sendMessage(((org.bukkit.ChatColor.DARK_RED) + (de.beimax.simplespleef.SimpleSpleef.ll("errors.teleport", "[ARENA]", getName()))));
            event.setCancelled(true);
            return true;
        }
    }
    return false;
}