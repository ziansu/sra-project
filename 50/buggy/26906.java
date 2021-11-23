@java.lang.Override
public int extractEnergy(net.minecraftforge.common.util.ForgeDirection from, int maxExtract, boolean simulate) {
    int usedEnergy = maxExtract;
    maxExtract -= this.buffer.extractEnergy(maxExtract, simulate);
    usedEnergy -= maxExtract;
    return usedEnergy;
}