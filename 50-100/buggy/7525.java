public static <T extends net.minecraft.item.Item> T getItemAs(net.minecraft.item.ItemStack itemStack, java.lang.Class<T> itemClass) {
    return (itemStack.getItem()) != null ? itemClass.isInstance(itemStack.getItem()) ? itemClass.cast(itemStack.getItem()) : null : null;
}