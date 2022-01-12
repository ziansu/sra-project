public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound compound) {
    compound = super.writeToNBT(compound);
    compound.setTag("Items", this.items.serializeNBT());
    compound.setInteger("CookTime", ((short) (this.cookTimeRemaining)));
    return compound;
}