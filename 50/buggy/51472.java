@org.bukkit.event.EventHandler
public void onPlayerLeave(org.bukkit.event.player.PlayerQuitEvent e) {
    new org.bukkit.scheduler.BukkitRunnable() {
        @java.lang.Override
        public void run() {
            me.badbones69.crazyenchantments.Main.CE.unloadCEPlayer(e.getPlayer());
        }
    }.runTaskAsynchronously(this);
}