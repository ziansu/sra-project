@org.bukkit.event.EventHandler
public void OnPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
    QueObjects.add(new US.bittiez.TotalTracker.QueObject(e.getPlayer().getUniqueId().toString(), SQLTABLE.JOINS, e.getPlayer().getName()));
    checkQue();
    if (config.getBoolean("auto_import", true)) {
        new US.bittiez.TotalTracker.ImportProcessor(e.getPlayer(), playerVersion, QueObjects).run();
    }
}