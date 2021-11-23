private static java.lang.String getModName(net.minecraft.item.ItemStack stack) {
    if (stack == null) {
        return "";
    }
    java.lang.String string = stack.getItem().getRegistryName().getResourceDomain();
    return string;
}