@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound par1) {
    super.readFromNBT(par1);
    this.owner = par1.getString("Owner");
    this.sentToEventList = par1.getBoolean("updated");
}