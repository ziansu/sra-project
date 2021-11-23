@java.lang.Override
public void readFromNBT(@org.jetbrains.annotations.NotNull
final net.minecraft.nbt.NBTTagCompound compound) {
    barracks = net.minecraft.nbt.NBTUtil.getPosFromTag(compound);
    super.readFromNBT(compound);
}