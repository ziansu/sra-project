private boolean isReadyToGrowUp(net.minecraft.item.ItemStack itemStack) {
    if (itemStack.hasTagCompound()) {
        final float ageInMinutes = ((float) (itemStack.getTagCompound().getInteger("age"))) / (radixcore.constant.Time.MINUTE);
        return ageInMinutes >= (mca.core.MCA.getConfig().babyGrowUpTime);
    }
    return false;
}