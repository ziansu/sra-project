public void setVolume(net.minecraft.item.ItemStack stack, int volume) {
    if (volume == 0) {
        setMaterial(stack, null);
    }
    if ((stack.getTagCompound()) == null)
        stack.setTagCompound(new net.minecraft.nbt.NBTTagCompound());
    
    stack.getTagCompound().setInteger("Volume", volume);
}