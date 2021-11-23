public static int sendEnergyTo(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, int maxSend, net.minecraft.util.EnumFacing side) {
    net.minecraft.tileentity.TileEntity tile = world.getTileEntity(pos.offset(side));
    if ((tile != null) && (com.brandon3055.brandonscore.lib.EnergyHelper.canReceiveEnergy(tile, side))) {
        return com.brandon3055.brandonscore.lib.EnergyHelper.insertEnergy(tile, maxSend, side, false);
    }
    return 0;
}