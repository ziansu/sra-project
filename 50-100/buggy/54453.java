@net.md_5.bungee.event.EventHandler
public void onJoin(net.md_5.bungee.api.event.ServerConnectEvent e) {
    net.md_5.bungee.api.connection.ProxiedPlayer p = e.getPlayer();
    if (cfg.System_enabled) {
        if (!(p.hasPermission("system.maintenance.join"))) {
            e.setCancelled(true);
            p.disconnect(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', cfg.System_kickMSG));
        }else {
            e.setCancelled(true);
            p.sendMessage(net.md_5.bungee.api.ChatColor.translateAlternateColorCodes('&', cfg.System_notify));
        }
    }
}