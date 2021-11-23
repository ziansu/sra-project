@java.lang.Override
@javax.annotation.Nullable
public <T> T getCapability(@javax.annotation.Nonnull
final net.minecraftforge.common.capabilities.Capability<T> capability, @javax.annotation.Nullable
final net.minecraft.util.EnumFacing facing) {
    if (((owner) != null) && (capability == (net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY))) {
        return CapabilityItemHandler.ITEM_HANDLER_CAPABILITY.cast(InfinityRegistry.instance.getInventory(owner, getChannel()));
    }
    return super.getCapability(capability, facing);
}