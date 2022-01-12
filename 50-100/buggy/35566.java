@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.energy.CapabilityEnergy.ENERGY)) {
        if ((hasMaster()) && (master.isFormed())) {
            net.minecraftforge.energy.IEnergyStorage energyStorage = master.getEnergyManager();
            return ((T) (energyStorage));
        }
    }
    return super.getCapability(capability, facing);
}