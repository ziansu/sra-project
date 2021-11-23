@java.lang.SuppressWarnings(value = "unchecked")
@javax.annotation.Nullable
@java.lang.Override
public <T> T getCapability(@javax.annotation.Nullable
net.minecraftforge.common.capabilities.Capability<T> capability, @javax.annotation.Nullable
net.minecraft.util.EnumFacing facing) {
    return ((facing == (net.minecraft.util.EnumFacing.DOWN)) || (facing == null)) && (capability == (net.minecraftforge.energy.CapabilityEnergy.ENERGY)) ? ((T) (energyStorage)) : null;
}