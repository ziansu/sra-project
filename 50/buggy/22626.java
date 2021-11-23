public static boolean hasKey(net.minecraft.item.ItemStack stack, java.lang.String... keys) {
    return (com.infinityraider.agricraft.utility.StackHelper.hasTag(stack)) && (com.infinityraider.agricraft.utility.NBTHelper.hasKey(stack.getTagCompound(), keys));
}