public boolean prepare() {
    org.bukkit.block.Block block = com.projectkorra.projectkorra.util.BlockSource.getWaterSourceBlock(player, selectRange, ClickType.SHIFT_DOWN, true, true, bPlayer.canPlantbend());
    cancelPrevious();
    com.projectkorra.projectkorra.waterbending.WaterManipulation.block(player);
    if (block != null) {
        sourceBlock = block;
        focusBlock();
        return true;
    }
    return false;
}