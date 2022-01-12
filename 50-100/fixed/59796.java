@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound nbtTag, boolean forSyncing) {
    super.readFromNBT(nbtTag, forSyncing);
    facing = net.minecraftforge.common.util.ForgeDirection.getOrientation(nbtTag.getInteger("Orientation"));
    distilBurnTime = nbtTag.getShort("BurnTime");
    distilCookTime = nbtTag.getShort("CookTime");
    currentItemBurnTime = nbtTag.getShort("CurrentItemBurn");
    this.amount = nbtTag.getInteger("Amount");
    liquidItemID = nbtTag.getInteger("LiquidID");
    this.theTank.readFromNBT(nbtTag);
}