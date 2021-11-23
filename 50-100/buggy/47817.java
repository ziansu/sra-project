public void startScheduler() {
    if ((snowMonitor) != null) {
        snowMonitor.cancel();
    }else {
        snowMonitor = new com.zmanww.bukkit.SnowControl.SnowMonitor(this);
    }
    this.getLogger().info((("Scheduling Monitor to start in 20sec... repeating every " + (com.zmanww.bukkit.SnowControl.Config.getInstance().getSnowFallDelay())) + "sec."));
    snowMonitor.runTaskTimer(com.zmanww.bukkit.SnowControl.SnowControl.plugin, 400L, ((com.zmanww.bukkit.SnowControl.Config.getInstance().getSnowFallDelay()) * 20L));
}