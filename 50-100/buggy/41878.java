public static int sendEnergyTo(net.minecraft.world.IBlockAccess world, net.minecraft.util.math.BlockPos pos, int maxSend, net.minecraft.util.EnumFacing side) {
    net.minecraft.tileentity.TileEntity tile = world.getTileEntity(pos.add(side.getFrontOffsetX(), side.getFrontOffsetY(), side.getFrontOffsetZ()));
    if ((tile != null) && (com.brandon3055.brandonscore.lib.EnergyHelper.canReceiveEnergy(tile, side.getOpposite()))) {
        return com.brandon3055.brandonscore.lib.EnergyHelper.insertEnergy(tile, maxSend, side.getOpposite(), false);
    }
    return 0;
}