@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOW)
public void pvp(com.SirBlobman.combatlog.listener.event.PlayerCombatEvent e) {
    org.bukkit.entity.Player p = e.getPlayer();
    org.bukkit.entity.LivingEntity le = e.getAttacker();
    org.bukkit.Location l = p.getLocation();
    if (!(pvp(l))) {
        e.setCancelled(true);
        java.lang.String msg = com.SirBlobman.combatlog.utility.Util.color(((com.SirBlobman.combatlog.config.Config.MSG_PREFIX) + (com.SirBlobman.combatlog.config.Config.MSG_FAIL)));
        le.sendMessage(msg);
    }
}