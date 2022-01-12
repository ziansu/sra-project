public void completeDungeon(org.bukkit.entity.Player player, yourselvs.dungeons.sessions.Session session) {
    yourselvs.dungeons.events.PlayerFinishDungeonEvent event = new yourselvs.dungeons.events.PlayerFinishDungeonEvent(session, new java.util.Date());
    org.bukkit.Bukkit.getServer().getPluginManager().callEvent(event);
    if (!(event.isCancelled()))
        player.teleport(session.getLocation());
    
}