@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void logsyncMonitor(org.bukkit.event.player.PlayerLoginEvent event) {
    if ((event.getResult()) == (PlayerLoginEvent.Result.ALLOWED))
        return ;
    
    final org.bukkit.entity.Player player = event.getPlayer();
    if (com.massivecraft.massivecore.util.MUtil.isntPlayer(player))
        return ;
    
    final java.util.UUID id = player.getUniqueId();
    this.idToState.remove(id);
}