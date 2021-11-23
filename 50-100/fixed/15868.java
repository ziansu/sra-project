@net.md_5.bungee.event.EventHandler
public void playerJoinBungeeServer(net.md_5.bungee.api.event.LoginEvent event) {
    net.md_5.bungee.api.config.ServerInfo server = db.getServer(event.getConnection().getUniqueId());
    if ((server != null) && (server.getName().equals(lobbyServer))) {
        vg.civcraft.mc.bettershards.bungee.BetterShardsBungee.getInstance().getLogger().info(java.lang.String.format(("The player %s (%s) has somehow logged " + "onto the lobby server without being redirected there."), event.getConnection().getName(), event.getConnection().getUniqueId().toString()));
    }
}