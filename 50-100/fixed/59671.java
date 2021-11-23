@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> cap, @javax.annotation.Nullable
net.minecraft.util.EnumFacing f) {
    if (cap == (net.minecraftforge.energy.CapabilityEnergy.ENERGY))
        return ((T) (fec));
    
    if ((tec) != null)
        if (((cap == (net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_PRODUCER)) || (cap == (net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_CONSUMER))) || (cap == (net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_HOLDER)))
            return ((T) (tec));
        
    
    return null;
}