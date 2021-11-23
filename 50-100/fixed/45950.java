public void sendUpdatePacket(boolean hahahahahahahahahahahaha) {
    net.minecraft.nbt.NBTTagCompound tag = new net.minecraft.nbt.NBTTagCompound();
    tag.setByteArray("bitz", connectData.toByteArray());
    if ((gridIdentifier) != null) {
        tag.setString("uidC", gridIdentifier.toString());
    }
    sendPacket(1, tag);
}