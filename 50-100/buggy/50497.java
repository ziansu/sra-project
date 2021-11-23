public boolean requestMatches(java.lang.Object request, net.minecraft.item.ItemStack filter) {
    if (request instanceof net.minecraft.item.ItemStack) {
        net.minecraft.item.ItemStack stack = ((net.minecraft.item.ItemStack) (request));
        return (stack.isItemEqual(filter)) && (net.minecraft.item.ItemStack.areItemStacksEqual(filter, stack));
    }
    java.lang.String name = ((java.lang.String) (request));
    return vazkii.botania.api.corporea.CorporeaHelper.stacksMatch(filter, name);
}