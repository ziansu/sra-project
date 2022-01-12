@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)) {
        if ((this) instanceof net.minecraft.inventory.ISidedInventory) {
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(new net.minecraftforge.items.wrapper.SidedInvWrapper(((net.minecraft.inventory.ISidedInventory) (this)), facing));
        }else {
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(new net.minecraftforge.items.wrapper.InvWrapper(this));
        }
    }
    return super.getCapability(capability, facing);
}