private void thaw() {
    for (org.bukkit.block.Block block : frozenBlocks.keySet()) {
        com.projectkorra.projectkorra.util.TempBlock.revertBlock(block, frozenBlocks.get(block));
        frozenBlocks.remove(block);
    }
}