public int getMetaFromState(net.minecraft.block.state.IBlockState state) {
    java.lang.System.out.println("Getting Meta from Blockstate");
    return state.getValue(com.mattpenguin.magicasolaris.block.BlockSolarCollector.PROPERTY_DIRECTION).ordinal();
}