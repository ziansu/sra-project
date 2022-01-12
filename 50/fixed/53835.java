@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.LOW)
public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent event) {
    if (event.isCancelled())
        return ;
    
    for (de.beimax.simplespleef.game.Game game : games) {
        if (game.onBlockBreak(event))
            return ;
        
    }
}