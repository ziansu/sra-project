@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR, ignoreCancelled = true)
public void bedBreakExplosion(org.bukkit.event.block.BlockExplodeEvent event) {
    if (config.get("lobby").getBool())
        return ;
    
    for (org.bukkit.block.Block b : event.blockList())
        bedBreak(b);
    
}