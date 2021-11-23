@java.lang.Override
public void closeInventory() {
    writeToNBT(invItem.getTagCompound());
}