@java.lang.Override
public net.minecraft.item.ItemStack insertItem(net.minecraftforge.common.util.ForgeDirection dir, net.minecraft.item.ItemStack stack) {
    int used = injectItem(stack, true, dir);
    if (used == (stack.stackSize)) {
        return null;
    }else {
        stack = stack.copy();
        stack.stackSize -= used;
        return stack;
    }
}