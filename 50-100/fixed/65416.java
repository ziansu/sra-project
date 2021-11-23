@java.lang.Override
public double charge(net.minecraft.tileentity.TileEntity tile, double amt, boolean ignoreBandwidth) {
    cofh.api.energy.IEnergyReceiver rec = asReceiver(tile);
    return rec == null ? amt : amt - (rec.receiveEnergy(cn.academy.support.rf.RFReceiverManager.DEFAULT_DIR, ((int) (amt)), false));
}