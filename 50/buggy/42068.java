@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int slot) {
    codechicken.lib.inventory.InventoryRange target = getTargetRange();
    if (target == null) {
        return null;
    }else {
        return codechicken.lib.inventory.InventoryUtils.getExtractableStack(target, target.slots[slot]);
    }
}