@java.lang.Override
public net.minecraft.item.ItemStack getStackInSlot(int i) {
    return i < (inventory.length) ? inventory[i] : craftResult.getStackInSlot(0);
}