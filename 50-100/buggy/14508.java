@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.NORMAL)
public void onPlayerDeath(org.bukkit.event.entity.PlayerDeathEvent event) {
    org.bukkit.Bukkit.getLogger().info((("[" + (uk.co.cherrygoose.radiationworld.Main.pluginName)) + "] onPlayerDeath called"));
    org.bukkit.entity.Player player = event.getEntity();
    if ((uk.co.cherrygoose.radiationworld.functions.Radiation.get(player)) >= (uk.co.cherrygoose.radiationworld.functions.Radiation.dLethal)) {
        event.setDeathMessage(((player.getName()) + " was killed by radiation"));
    }
    uk.co.cherrygoose.radiationworld.functions.Radiation.set(player, 0.0);
}