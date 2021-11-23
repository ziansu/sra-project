@org.bukkit.event.EventHandler
public void onBlockFromTo(org.bukkit.event.block.BlockFromToEvent event) {
    org.bukkit.block.Block targetBlock = event.getToBlock();
    org.bukkit.block.Block sourceBlock = event.getBlock();
    com.elmakers.mine.bukkit.api.block.UndoList undoList = getPendingUndo(sourceBlock.getLocation());
    if (undoList != null) {
        undoList.add(targetBlock, true);
    }else {
        undoList = getPendingUndo(targetBlock.getLocation());
        if (undoList != null) {
            undoList.add(targetBlock, true);
        }
    }
}