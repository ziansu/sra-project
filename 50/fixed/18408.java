public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    return state.getValue(com.mattpenguin.magicasolaris.block.BlockSolarCollector.PROPERTY_DIRECTION).ordinal();
}