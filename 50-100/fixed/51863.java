@org.bukkit.event.EventHandler
@java.lang.SuppressWarnings(value = "unused")
public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent ev) {
    final org.bukkit.entity.Player p = ev.getPlayer();
    if (((p.hasPermission("multispawn.noteleport")) || (plugin.getSpawnUtils().getSpawns(p, false).isEmpty())) || ((plugin.getSpawnUtils().getSpawns(p, false)) == null)) {
        return ;
    }
    plugin.getSpawnUtils().sendPlayerToSpawn(p);
}