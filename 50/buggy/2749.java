@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int slot, int amount) {
    net.minecraft.item.ItemStack stack = inventory.decrStackSize(slot, amount);
    java.lang.System.out.println(("Dec " + slot));
    updateState();
    return stack;
}