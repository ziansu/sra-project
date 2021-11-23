private boolean isDifferent(final net.minecraft.item.ItemStack a, final net.minecraft.item.ItemStack b) {
    if ((a == b) && (b == null)) {
        return false;
    }
    if (((a == null) && (b != null)) || ((a != null) && (b == null))) {
        return true;
    }
    return !(appeng.util.Platform.isSameItemPrecise(a, b));
}