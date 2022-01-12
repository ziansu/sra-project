@java.lang.Override
public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, net.minecraft.util.EnumFacing facing) {
    return (capability != null) && (capability == (com.gendeathrow.hatchery.common.capability.CapabilityAnimalStatsHandler.ANIMAL_HANDLER_CAPABILITY));
}