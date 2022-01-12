@java.lang.Override
public net.minecraft.nbt.NBTTagCompound writeToNBT(net.minecraft.nbt.NBTTagCompound tag) {
    if ((location) != null)
        location.writeToNBT(tag);
    
    if ((type) != null)
        type.writeToNBT(tag);
    else {
        mcmultipart.multipart.MultipartHelper.getPartContainer(getWorld(), getPos()).removePart(this);
    }
    return tag;
}