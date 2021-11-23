@java.lang.Override
public net.minecraft.tileentity.TileEntity createNewTileEntity(net.minecraft.world.World worldIn, int meta) {
    FierySouls.logger.info("Created new TileEntityTorchLit tile entity.");
    return new com.yooksi.fierysouls.tileentity.TileEntityTorchLit(worldIn.getTotalWorldTime());
}