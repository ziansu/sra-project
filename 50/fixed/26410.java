@java.lang.Override
public void closeInventory() {
    writeToNBT(invItem.getTagCompound());
    java.lang.System.out.println(invItem.getTagCompound());
}