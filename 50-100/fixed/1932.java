@org.bukkit.event.EventHandler
public void onJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    if (m.u.enabledingame) {
        if ((m.u.update) == true) {
            e.getPlayer().sendMessage("�6[�2Updater�6] �3Look at the console, there is an update for HeadGetter!");
        }else {
            e.getPlayer().sendMessage("�6[�2Updater�6] �3There isn't update for HeadGetter!");
        }
    }
}