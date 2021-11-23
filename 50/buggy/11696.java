@java.lang.Override
public void WriteCommonRecord(net.minecraft.nbt.NBTTagCompound TagCompound) {
    super.WriteCommonRecord(TagCompound);
    if ((Player) == null)
        Player = "";
    
    TagCompound.setString("Player", Player);
    TagCompound.setInteger("Label", Label);
}