@org.bukkit.event.EventHandler
public void onJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    e.getPlayer().setGameMode(GameMode.ADVENTURE);
    if ((ru.mrbrikster.safeauth.PluginManager.isRegistred(e.getPlayer())) && (ru.mrbrikster.safeauth.PluginManager.isSessionActive(e.getPlayer()))) {
        ru.mrbrikster.safeauth.PluginManager.sendMainServer(e.getPlayer());
        return ;
    }
    ru.mrbrikster.safeauth.PluginManager.startTask(e.getPlayer(), (ru.mrbrikster.safeauth.PluginManager.isRegistred(e.getPlayer()) ? ru.mrbrikster.safeauth.AuthManager.TaskType.LOGIN : ru.mrbrikster.safeauth.AuthManager.TaskType.REGISTER));
}