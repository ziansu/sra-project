@org.bukkit.event.EventHandler
public void onBlockBurn(org.bukkit.event.block.BlockBurnEvent event) {
    org.bukkit.block.Block targetBlock = event.getBlock();
    com.elmakers.mine.bukkit.api.block.UndoList undoList = getPendingUndo(targetBlock.getLocation());
    if (undoList != null) {
        undoList.add(targetBlock);
    }
}