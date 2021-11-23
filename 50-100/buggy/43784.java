@java.lang.Deprecated
public int extractEnergy(net.minecraft.util.EnumFacing from, int maxExtract, boolean simulate) {
    if (!(canProvideEnergy(from))) {
        return 0;
    }
    maxExtract *= reborncore.common.RebornCoreConfig.euPerFU;
    int energyExtracted = java.lang.Math.min(getEnergyStored(null), java.lang.Math.min(maxExtract, maxExtract));
    if (!simulate) {
        setEnergy(((energy) - energyExtracted));
    }
    return energyExtracted * (reborncore.common.RebornCoreConfig.euPerFU);
}