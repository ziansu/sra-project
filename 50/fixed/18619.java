public static double charge(net.minecraft.tileentity.TileEntity tile, double amt, boolean ignoreBandwidth) {
    for (cn.academy.support.EnergyBlockHelper.IEnergyBlockManager handler : cn.academy.support.EnergyBlockHelper.handlers) {
        if (handler.isSupported(tile)) {
            handler.charge(tile, amt, ignoreBandwidth);
        }
    }
    return amt;
}