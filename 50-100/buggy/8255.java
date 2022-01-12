@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR)
public void onTp(org.bukkit.event.player.PlayerTeleportEvent e) {
    org.bukkit.entity.Player p = e.getPlayer();
    if (!(isHidden(p)))
        return ;
    
    if (!(e.getFrom().getWorld().getName().equals(e.getTo().getWorld().getName())))
        return ;
    
    if (cfg.getBoolean("Configuration.Players.AddNightVision"))
        p.removePotionEffect(PotionEffectType.NIGHT_VISION);
    
    if (cfg.getBoolean("Configuration.Players.EnableGhostPlayers"))
        p.removePotionEffect(PotionEffectType.INVISIBILITY);
    
}