@java.lang.Override
public boolean hasCapability(net.minecraftforge.common.capabilities.Capability<?> capability, @javax.annotation.Nullable
net.minecraft.util.EnumFacing facing) {
    if ((capability == (net.minecraftforge.fluids.capability.CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY)) && ((facing == null) || ((facing.getAxis()) == (EnumFacing.Axis.Y)))) {
        return true;
    }
    if ((capability == (com.Da_Technomancer.crossroads.API.Capabilities.MAGIC_HANDLER_CAPABILITY)) && ((facing == null) || ((facing.getAxis()) != (EnumFacing.Axis.Y)))) {
        return true;
    }
    return super.hasCapability(capability, facing);
}