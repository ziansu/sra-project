private boolean isDifferent(final net.minecraft.item.ItemStack a, final net.minecraft.item.ItemStack b) {
    if ((a == b) && (b == null)) {
        return false;
    }
    return ((a == null) || (b == null)) || (!(appeng.util.Platform.isSameItemPrecise(a, b)));
}