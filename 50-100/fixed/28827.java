public boolean prepare() {
    org.bukkit.block.Block block = com.projectkorra.projectkorra.util.BlockSource.getWaterSourceBlock(player, selectRange, ClickType.SHIFT_DOWN, true, true, bPlayer.canPlantbend());
    cancelPrevious();
    if (block != null) {
        sourceBlock = block;
        focusBlock();
        return true;
    }
    return false;
}