@java.lang.SuppressWarnings(value = "unused")
@Optional.Method(modid = "tesla")
private boolean hasTeslaCapability(net.minecraftforge.common.capabilities.Capability<?> capability, net.minecraft.util.EnumFacing facing) {
    return capability == (net.darkhax.tesla.capability.TeslaCapabilities.CAPABILITY_CONSUMER);
}