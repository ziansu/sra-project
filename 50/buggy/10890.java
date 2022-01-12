@java.lang.Override
public boolean canExtractItem(int slot, net.minecraft.item.ItemStack stack, int side) {
    java.lang.System.out.println(((stack.getItem()) instanceof cofh.api.energy.IEnergyContainerItem));
    return slot == 1;
}