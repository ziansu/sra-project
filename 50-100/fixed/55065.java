@org.bukkit.event.EventHandler
public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent e) {
    if ((e.getPlayer()) != null)
        QueObjects.add(new US.bittiez.TotalTracker.QueObject(e.getPlayer().getUniqueId().toString(), SQLTABLE.BLOCKS_BROKEN, e.getPlayer().getName()));
    
    checkQue();
}