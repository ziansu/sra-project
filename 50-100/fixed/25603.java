@java.lang.Override
public void breakBlock(net.minecraft.world.World world, net.minecraft.util.math.BlockPos pos, net.minecraft.block.state.IBlockState blockstate) {
    kriNon.endernet.tileentities.TileEntityEnderTransmitter te = ((kriNon.endernet.tileentities.TileEntityEnderTransmitter) (world.getTileEntity(pos)));
    net.minecraft.inventory.InventoryHelper.dropInventoryItems(world, pos, te);
    EnderRegistry.instance.unregister(te.getEndernetID());
    super.breakBlock(world, pos, blockstate);
}