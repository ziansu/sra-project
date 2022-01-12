@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)) {
        if (((inputSlot.getStackInSlot(0)) != null) && ((inputSlot.getStackInSlot(0).stackSize) >= (((downstremrequests) > 0 ? 1 : 0) + 1)))
            return null;
        
        return ((T) (inputSlot));
    }
    return super.getCapability(capability, facing);
}