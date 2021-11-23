@java.lang.SuppressWarnings(value = "unchecked")
@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> cap, @javax.annotation.Nullable
net.minecraft.util.EnumFacing f) {
    if (cap == (CapabilityEnergy.ENERGY))
        return ((T) (fec));
    
    if ((tec) != null)
        if (cap == (net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_PRODUCER))
            return ((T) (tec));
        
    
    return null;
}