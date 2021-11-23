@java.lang.Override
public int requestEnergy(int energy, boolean simulate) {
    int given = this.storage.extractEnergy(energy, simulate);
    if (!simulate) {
        this.markDirty();
        if (!(worldObj.isRemote)) {
            this.lastOut += given;
        }
    }
    return given;
}