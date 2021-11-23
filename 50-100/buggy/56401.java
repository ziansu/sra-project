public void setVolume(net.minecraft.item.ItemStack stack, int volume) {
    if (volume == 0) {
        stack.setTagCompound(null);
        setMaterial(stack, null);
        return ;
    }
    if ((stack.getTagCompound()) == null)
        stack.setTagCompound(new net.minecraft.nbt.NBTTagCompound());
    
    stack.getTagCompound().setInteger("Volume", volume);
}