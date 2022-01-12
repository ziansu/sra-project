@org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.MONITOR, ignoreCancelled = true)
public void onBlockPistonRetract(org.bukkit.event.block.BlockPistonRetractEvent event) {
    if (!(event.isSticky())) {
        return ;
    }
    org.bukkit.block.Block movedBlock = event.getRetractLocation().getBlock();
    new com.gmail.nossr50.runnables.StickyPistonTrackerTask(event.getDirection(), event.getBlock(), movedBlock).runTaskLater(plugin, 2);
}