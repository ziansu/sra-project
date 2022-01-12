public static void setBurningAtPos(net.minecraft.world.World worldIn, net.minecraft.util.math.BlockPos pos, boolean burning) {
    net.minecraft.block.state.IBlockState blockState = worldIn.getBlockState(pos);
    worldIn.setBlockState(pos, blockState.withProperty(com.plutomc.core.common.blocks.BlockAlloyFurnace.BURNING, burning), 3);
    net.minecraft.tileentity.TileEntity tileEntity = worldIn.getTileEntity(pos);
    if (tileEntity != null) {
        tileEntity.validate();
        worldIn.setTileEntity(pos, tileEntity);
    }
}