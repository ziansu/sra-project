@java.lang.Override
public void writeToNBT(final net.minecraft.nbt.NBTTagCompound tagRoot) {
    super.writeToNBT(tagRoot);
    tagRoot.setString("InfType", this.getTypes().toString());
}