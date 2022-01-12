public static boolean canStacksMerge(net.minecraft.item.ItemStack stack1, net.minecraft.item.ItemStack stack2) {
    if ((stack1 == (net.minecraft.item.ItemStack.EMPTY)) || (stack2 == (net.minecraft.item.ItemStack.EMPTY))) {
        return false;
    }
    if (!(stack1.isItemEqual(stack2))) {
        return false;
    }
    if (!(net.minecraft.item.ItemStack.areItemStackTagsEqual(stack1, stack2))) {
        return false;
    }
    return true;
}