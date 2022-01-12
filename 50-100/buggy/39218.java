public static boolean isInvalidComb(net.minecraft.item.ItemStack stack) {
    if ((stack.isEmpty()) || ((stack.getItem()) != (binnie.extrabees.ExtraBees.comb))) {
        return true;
    }
    binnie.extrabees.items.types.EnumHoneyComb honeyComb = binnie.extrabees.items.types.EnumHoneyComb.get(stack);
    return !(honeyComb.isActive());
}