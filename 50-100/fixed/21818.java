@java.lang.Override
public boolean isItemValidForSlot(int index, net.minecraft.item.ItemStack stack) {
    return ((index >= 0) && (index < (getSizeInventory()))) && ((stack == null) || ((stack.getItem()) == (com.github.blackjak34.compute.DoesNotCompute.punchCardStack)));
}