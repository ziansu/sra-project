public net.minecraft.block.state.IBlockState getStateFromMeta(int meta) {
    java.lang.System.out.println("Getting Blockstate from Meta");
    return this.getDefaultState().withProperty(com.mattpenguin.magicasolaris.block.BlockSolarCollector.PROPERTY_DIRECTION, net.minecraft.util.EnumFacing.values()[meta]);
}