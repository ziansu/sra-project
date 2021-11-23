public static java.util.Optional<net.minecraft.item.ItemStack> getPrizeStack(net.minecraft.item.ItemStack stack) {
    if ((stack.getTagCompound()) == null) {
        stack.setTagCompound(new net.minecraft.nbt.NBTTagCompound());
    }
    net.minecraft.nbt.NBTTagCompound tag = stack.getTagCompound().getCompoundTag("skree_held_prize_data");
    if (tag != null) {
        return java.util.Optional.of(com.skelril.nitro.transformer.ForgeTransformer.tf(new net.minecraft.item.ItemStack(tag)));
    }
    return java.util.Optional.empty();
}