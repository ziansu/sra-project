@java.lang.Override
@javax.annotation.Nullable
public net.minecraft.server.v1_7_R4.NBTTagCompound parse(java.lang.String rawNBT, ch.njol.skript.lang.ParseContext context) {
    if ((rawNBT.startsWith("nbt:{")) && (rawNBT.endsWith("}"))) {
        net.minecraft.server.v1_7_R4.NBTTagCompound NBT = parseRawNBT(rawNBT.substring(4));
        return NBT;
    }
    return null;
}