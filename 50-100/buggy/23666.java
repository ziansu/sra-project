public void onPlayerQuit(org.bukkit.event.player.PlayerQuitEvent event) {
    yourselvs.dungeons.sessions.Session session = plugin.getSessionManager().getSession(event.getPlayer());
    if (session != null) {
        plugin.getSessionManager().removeSession(session.getPlayer());
        plugin.getMessenger().quitDungeon(event.getPlayer(), session);
    }
}