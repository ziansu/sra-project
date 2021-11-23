public int sendEnergyTo(net.minecraft.util.EnumFacing side) {
    if ((getEnergyStored()) == 0) {
        return 0;
    }
    net.minecraft.tileentity.TileEntity tile = worldObj.getTileEntity(pos.add(side.getFrontOffsetX(), side.getFrontOffsetY(), side.getFrontOffsetZ()));
    if ((tile != null) && (com.brandon3055.brandonscore.lib.EnergyHelper.canReceiveEnergy(tile, side))) {
        return com.brandon3055.brandonscore.lib.EnergyHelper.insertEnergy(tile, getEnergyStored(), false);
    }
    return 0;
}