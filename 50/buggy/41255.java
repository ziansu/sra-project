@java.lang.Override
public net.minecraft.item.ItemStack decrStackSize(int n) {
    net.minecraft.item.ItemStack stack = getStack();
    stack.stackSize = 0;
    return stack;
}