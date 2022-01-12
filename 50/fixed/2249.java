private boolean hasWater(net.minecraft.block.state.IBlockState state) {
    return state.getValue(com.mrcrayfish.furniture.blocks.BlockBasin.FILLED);
}