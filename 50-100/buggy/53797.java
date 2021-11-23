@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onJoin(org.bukkit.event.player.AsyncPlayerPreLoginEvent event) {
    me.confuser.banmanager.listeners.PlayerData player = new me.confuser.banmanager.listeners.PlayerData(event.getUniqueId(), event.getName(), event.getAddress());
    try {
        plugin.getPlayerStorage().createOrUpdate(player);
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    if ((event.getLoginResult()) != (AsyncPlayerPreLoginEvent.Result.ALLOWED))
        return ;
    
    plugin.getPlayerStorage().addOnline(player);
}