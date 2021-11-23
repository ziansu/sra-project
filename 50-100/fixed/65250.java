private boolean isReadyToGrowUp(net.minecraft.item.ItemStack itemStack) {
    if (itemStack.hasTagCompound()) {
        final int ageInMinutes = itemStack.getTagCompound().getInteger("age");
        return ageInMinutes >= (mca.core.MCA.getConfig().babyGrowUpTime);
    }
    return false;
}