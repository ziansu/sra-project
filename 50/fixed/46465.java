public void sendNBTToGui(net.minecraft.nbt.NBTTagCompound nbt) {
    if ((player) instanceof net.minecraft.entity.player.EntityPlayerMP)
        com.creativemd.creativecore.common.packet.PacketHandler.sendPacketToPlayer(new com.creativemd.creativecore.common.packet.gui.GuiNBTPacket(nbt), ((net.minecraft.entity.player.EntityPlayerMP) (player)));
    
}