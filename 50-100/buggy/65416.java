@java.lang.Override
public double charge(net.minecraft.tileentity.TileEntity tile, double amt, boolean ignoreBandwidth) {
    cofh.api.energy.IEnergyReceiver rec = asReceiver(tile);
    return rec == null ? 0 : amt - ((rec.receiveEnergy(cn.academy.support.rf.RFReceiverManager.DEFAULT_DIR, ((int) (amt / (RFSupport.CONV_RATE))), false)) * (RFSupport.CONV_RATE));
}