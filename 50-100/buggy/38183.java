public static boolean bagIsOpenable(net.minecraft.item.ItemStack stack) {
    if ((stack.getTagCompound()) == null) {
        return true;
    }
    if (stack.getTagCompound().getCompoundTag("HandyBag").getBoolean("DisableOpen")) {
        return false;
    }
    return true;
}