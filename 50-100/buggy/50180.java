@java.lang.Override
public void onDisable() {
    com.endercrest.colorcube.SettingsManager.getInstance().saveSystemConfig();
    reloadConfig();
    for (com.endercrest.colorcube.game.Game g : com.endercrest.colorcube.GameManager.getInstance().getGames()) {
        g.disable();
        com.endercrest.colorcube.logging.QueueManager.getInstance().rollback(g.getId(), true);
    }
    com.endercrest.colorcube.MessageManager.getInstance().log((("&e" + (getDescription().getVersion())) + " by EnderCrest disabled"));
}