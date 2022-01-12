@java.lang.Override
public void run() {
    org.bukkit.entity.Player p = server.getPlayer(uuid);
    if ((p != null) && (p.isOnline())) {
        manager.save(p, false);
    }else {
        server.getScheduler().cancelTask(id);
    }
}