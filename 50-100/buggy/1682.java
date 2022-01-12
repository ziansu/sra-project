@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
public void onPlayerLogin(org.bukkit.event.player.PlayerJoinEvent e) {
    final org.bukkit.entity.Player p = e.getPlayer();
    if (p.hasPermission("OldCombatMechanics.notify")) {
        org.bukkit.Bukkit.getScheduler().runTaskLaterAsynchronously(plugin, new java.lang.Runnable() {
            public void run() {
                gvlfm78.plugin.OldCombatMechanics.OCMUpdateChecker updateChecker = new gvlfm78.plugin.OldCombatMechanics.OCMUpdateChecker(plugin, pluginFile);
                updateChecker.sendUpdateMessages(p);
            }
        }, 20L);
    }
}