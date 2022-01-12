@java.lang.Override
public void WriteCommonRecord(net.minecraft.nbt.NBTTagCompound TagCompound) {
    super.WriteCommonRecord(TagCompound);
    TagCompound.setString("Player", Player);
    TagCompound.setInteger("Label", Label);
}