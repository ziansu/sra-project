public static boolean isInvalidComb(net.minecraft.item.ItemStack stack) {
    if (stack.isEmpty()) {
        return true;
    }
    if ((stack.getItem()) != (binnie.extrabees.ExtraBees.comb)) {
        return false;
    }
    binnie.extrabees.items.types.EnumHoneyComb honeyComb = binnie.extrabees.items.types.EnumHoneyComb.get(stack);
    return !(honeyComb.isActive());
}