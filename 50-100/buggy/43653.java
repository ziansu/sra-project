public static net.minecraft.item.ItemStack getItemStackFromBlockState(net.minecraft.block.state.IBlockState blockState) {
    final net.minecraft.item.Item item = com.minecolonies.util.BlockUtils.getItem(blockState);
    if (item == null) {
        return null;
    }
    com.minecolonies.util.Block block = blockState.getBlock();
    if ((item instanceof net.minecraft.item.ItemBlock) && (!(block.isFlowerPot()))) {
        block = com.minecolonies.util.Block.getBlockFromItem(item);
    }
    return new net.minecraft.item.ItemStack(item, 1, com.minecolonies.util.BlockUtils.getDamageValue(block, blockState));
}