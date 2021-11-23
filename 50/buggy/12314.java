@java.lang.Override
public void setInventorySlotContents(int slot, net.minecraft.item.ItemStack stack) {
    inventory.setInventorySlotContents(slot, stack);
    java.lang.System.out.println(((("Set " + slot) + " ") + stack));
    updateState();
}