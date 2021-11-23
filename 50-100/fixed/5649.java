public void send(org.bukkit.entity.Player player, int delay) {
    bossBar.addPlayer(player);
    bossBar.setVisible(true);
    org.bukkit.Bukkit.getScheduler().runTaskLater(Main.plugin, new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            hide(player);
        }
    }, ((long) (delay)));
}