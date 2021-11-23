@org.bukkit.event.EventHandler
public void onBlockFall(org.bukkit.event.entity.EntityChangeBlockEvent event) {
    for (me.xorgon.connect4.util.PhysicalBoard board : manager.getBoards().values()) {
        for (org.bukkit.entity.FallingBlock fallingBlock : board.getFallingBlocks()) {
            if ((event.getEntity()) == fallingBlock) {
                board.handleFallingBlock(fallingBlock);
            }
        }
    }
}