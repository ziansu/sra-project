@java.lang.Override
public void onBlockPlacedBy(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state, net.minecraft.entity.EntityLivingBase placer, net.minecraft.item.ItemStack stack) {
    super.onBlockPlacedBy(worldIn, pos, state, placer, stack);
    worldIn.setBlockState(pos, state.withProperty(de.dbone.betterstorage.tile.TileReinforcedChest.FACING, getFacingFromEntity(worldIn, pos, placer)), 2);
    ((de.dbone.betterstorage.tile.entity.TileEntityReinforcedChest) (worldIn.getTileEntity(pos))).onBlockPlaced(placer, stack);
}