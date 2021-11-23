public static boolean getFlipped(net.minecraft.item.ItemStack stack) {
    if (blusunrize.immersiveengineering.common.util.ItemNBTHelper.hasKey(stack, "flip")) {
        return blusunrize.immersiveengineering.common.util.ItemNBTHelper.getBoolean(stack, "flip");
    }
    return false;
}