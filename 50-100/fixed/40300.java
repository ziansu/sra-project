@java.lang.Override
public boolean onPlayerGameModeChange(org.bukkit.event.player.PlayerGameModeChangeEvent event) {
    if (!(isEnabled()))
        return false;
    
    org.bukkit.entity.Player player = event.getPlayer();
    if ((hasPlayer(player)) || (hasSpectator(player))) {
        event.getPlayer().sendMessage(((org.bukkit.ChatColor.DARK_RED) + (de.beimax.simplespleef.SimpleSpleef.ll("errors.gamemodeChange"))));
        event.setCancelled(true);
        return true;
    }
    return false;
}