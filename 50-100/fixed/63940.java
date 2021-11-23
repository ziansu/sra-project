@net.md_5.bungee.event.EventHandler
public void onPlayerDisconnect(net.md_5.bungee.api.event.PlayerDisconnectEvent event) {
    java.lang.String name = event.getPlayer().getName();
    if (!(_playerDB.remove(name))) {
        for (net.md_5.bungee.api.connection.ProxiedPlayer player : net.md_5.bungee.api.ProxyServer.getInstance().getPlayers()) {
            player.sendMessage(new net.md_5.bungee.api.chat.TextComponent((((net.md_5.bungee.api.ChatColor.YELLOW) + name) + " left the network.")));
        }
    }
}