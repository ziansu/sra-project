@java.lang.Override
public void onPlayerGameModeChange(org.bukkit.event.player.PlayerGameModeChangeEvent event) {
    if (!(isEnabled()))
        return ;
    
    org.bukkit.entity.Player player = event.getPlayer();
    if ((hasPlayer(player)) || (hasSpectator(player))) {
        event.getPlayer().sendMessage(((org.bukkit.ChatColor.DARK_RED) + (de.beimax.simplespleef.SimpleSpleef.ll("errors.gamemodeChange"))));
        event.setCancelled(true);
    }
}