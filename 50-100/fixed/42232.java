public void breakBlock(net.minecraft.world.World worldIn, net.minecraft.util.BlockPos pos, net.minecraft.block.state.IBlockState state) {
    net.minecraft.tileentity.TileEntity tileentity = worldIn.getTileEntity(pos);
    if (tileentity instanceof simElectricity.Common.Blocks.TileEntity.TileElectricFurnace) {
        net.minecraft.inventory.InventoryHelper.dropInventoryItems(worldIn, pos, ((simElectricity.Common.Blocks.TileEntity.TileElectricFurnace) (tileentity)));
        worldIn.updateComparatorOutputLevel(pos, this);
    }
    super.breakBlock(worldIn, pos, state);
}