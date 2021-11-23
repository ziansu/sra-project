@java.lang.Override
public void handleUpdateTag(net.minecraft.nbt.NBTTagCompound tag) {
    this.selectedModule = tag.getByte("msel");
    this.itemInventory.setIsRemote(true);
    this.itemInventory.setContainerItemStack(this.getContainerStack());
    super.handleUpdateTag(tag);
}