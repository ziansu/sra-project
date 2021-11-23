@java.lang.Override
public int receiveEnergy(net.minecraftforge.common.util.ForgeDirection from, int maxReceive, boolean simulate) {
    int taken = storage.receiveEnergy(maxReceive, simulate);
    if (!simulate) {
        if (!(worldObj.isRemote)) {
            this.lastIn += taken;
        }
        this.markDirty();
    }
    return taken;
}