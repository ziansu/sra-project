@java.lang.Override
public net.minecraft.item.ItemStack getTabIconItem() {
    net.minecraft.item.ItemStack stack = new net.minecraft.item.ItemStack(clayborn.universalremote.items.ItemRegistry.Items().UniveralRemote, 1, 1);
    clayborn.universalremote.items.ItemNBTEnergyStorage storage = ((clayborn.universalremote.items.ItemNBTEnergyStorage) (clayborn.universalremote.util.CapabilityHelper.tryGetCapability(stack, CapabilityEnergy.ENERGY, null)));
    storage.setEnergyStored(storage.getMaxEnergyStored());
    return stack;
}