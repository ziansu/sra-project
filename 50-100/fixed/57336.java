public int sendEnergyTo(net.minecraft.util.EnumFacing side) {
    if ((getEnergyStored()) == 0) {
        return 0;
    }
    net.minecraft.tileentity.TileEntity tile = worldObj.getTileEntity(pos.offset(side));
    if ((tile != null) && (com.brandon3055.brandonscore.lib.EnergyHelper.canReceiveEnergy(tile))) {
        return com.brandon3055.brandonscore.lib.EnergyHelper.insertEnergy(tile, getEnergyStored(), false);
    }
    return 0;
}