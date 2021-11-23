@java.lang.Override
public void readFromNBT(net.minecraft.nbt.NBTTagCompound tag) {
    super.readFromNBT(tag);
    this.isDouble = tag.getBoolean("isDouble");
    this.isTop = tag.getBoolean("isTop");
    if (isDouble) {
        capacity = 2 * (originalCapacity);
    }
    this.tank.setCapacity(capacity);
}