protected static boolean isArrow(net.minecraft.item.ItemStack stack) {
    if ((stack != null) && (!(stack.isEmpty()))) {
        return (stack.getItem()) instanceof net.minecraft.item.ItemArrow;
    }
    return false;
}