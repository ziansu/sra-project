@java.lang.Override
public int getEnergyStored(net.minecraft.util.EnumFacing from) {
    return (getNetwork()) != null ? getNetwork().getEnergy().getEnergyStored() : 0;
}