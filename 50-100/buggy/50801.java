@java.lang.Override
public <T> T getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, net.minecraft.util.EnumFacing facing) {
    if (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY)) {
        if (isBottom(facing)) {
            return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(handlers[0]);
        }else
            if (isTop(facing)) {
                return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(handlers[1]);
            }else
                if (isBack(facing)) {
                    return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(handlers[2]);
                }
            
        
    }
    return null;
}