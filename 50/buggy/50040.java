private void thaw() {
    for (org.bukkit.block.Block block : frozenBlocks.keySet()) {
        com.projectkorra.projectkorra.util.TempBlock.revertBlock(block, Material.AIR);
        frozenBlocks.remove(block);
    }
}